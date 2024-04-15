package com.example.homework6;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    private final MainFrame mainFrame;
    private JButton loadButton;
    private JButton saveButton;
    private JButton resetButton;
    private JButton printButton;
    private JButton exitButton;

    public ControlPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        init();
    }

    private void init() {
        initComponents();
        addActionListeners();
        addComponents();
    }

    private void initComponents() {
        loadButton = new JButton("Load");
        saveButton = new JButton("Save");
        resetButton = new JButton("Reset");
        printButton = new JButton("Print");
        exitButton = new JButton("Exit");
    }

    private void addActionListeners() {
        saveButton.addActionListener(e -> mainFrame.saveGame());
        loadButton.addActionListener(e -> mainFrame.loadGame());
        resetButton.addActionListener(e -> mainFrame.resetGame());
        printButton.addActionListener(e -> mainFrame.printPicture());
        exitButton.addActionListener(e -> mainFrame.dispose());
    }

    private void addComponents() {
        add(loadButton);
        add(saveButton);
        add(resetButton);
        add(printButton);
        add(exitButton);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 50);
    }

}
