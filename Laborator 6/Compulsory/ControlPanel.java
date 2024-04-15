package org.example;

import org.example.MainFrame;

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
        addComponents();
    }

    private void initComponents() {
        loadButton = new JButton("Load");
        saveButton = new JButton("Save");
        resetButton = new JButton("Reset");
        printButton = new JButton("Print");
        exitButton = new JButton("Exit");
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
