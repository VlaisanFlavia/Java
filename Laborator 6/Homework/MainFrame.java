package com.example.homework6;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;

public class MainFrame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private static final String PATH = "/Users/stefania/Documents/";

    private ConfigurationPanel configurationPanel;
    private DrawingPanel drawingPanel;
    private ControlPanel controlPanel;
    private Game game;

    public MainFrame() {
        super("Position game");
        init();
    }

    private void init() {
        initGame();
        initPanels();
        addPanels();

        setVisible(true);
        pack();
    }

    private void initGame() {
        this.game = new Game(HEIGHT);
    }

    private void initPanels() {
        configurationPanel = new ConfigurationPanel(this);
        drawingPanel = new DrawingPanel(WIDTH, HEIGHT);
        controlPanel = new ControlPanel(this);
    }

    private void addPanels() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        add(configurationPanel, NORTH);
        add(drawingPanel, CENTER);
        add(controlPanel, SOUTH);
    }

    public void newGame(int numberOfDots, double lineProbability) {
        game.generate(numberOfDots, lineProbability);
        drawingPanel.newGame(game);
    }

    public void printPicture() {
        try {
            BufferedImage image = drawingPanel.getImage();
            ImageIO.write(image, "PNG", new File(PATH + "Game.png"));
        } catch (IOException e) {
            System.out.println("Failed to print image");
            throw new RuntimeException(e);
        }
    }

    public void resetGame() {
        game.reset();
        drawingPanel.newGame(game);
    }

    public void saveGame() {
        try {
            FileOutputStream fileOut = new FileOutputStream(PATH + "Game.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(game);
            objectOut.close();
        } catch (Exception e) {
            System.out.println("Failed to save");
        }
    }

    public void loadGame() {
        try {
            FileInputStream fileIn = new FileInputStream(PATH + "Game.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            game = (Game) objectIn.readObject();
            drawingPanel.newGame(game);
        } catch(Exception e) {
            System.out.println("Failed to load");
        }
    }

}
