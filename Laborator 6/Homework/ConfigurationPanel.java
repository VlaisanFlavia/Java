package com.example.homework6;

import com.example.homework6.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ConfigurationPanel extends JPanel {

    private final MainFrame mainFrame;
    private JLabel dotsLabel;
    private JSpinner dotsSpinner;
    private JLabel linesLabel;
    private JComboBox<Object> linesCombo;
    private JButton createButton;

    public ConfigurationPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        init();
    }

    private void init() {
        initComponents();
        addActionListeners();
        addComponents();
    }

    private void initComponents() {
        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 20, 1));
        linesLabel = new JLabel("Line probability:");
        linesCombo = new JComboBox<>(List.of(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.0, 1.0).toArray());
        createButton = new JButton("Create new game");
    }

    private void addActionListeners() {
        createButton.addActionListener(e -> {
            int numberOfDots = (Integer) dotsSpinner.getValue();
            double lineProbability = (Double) linesCombo.getSelectedItem();
            mainFrame.newGame(numberOfDots, lineProbability);
        });
    }

    private void addComponents() {
        add(dotsLabel);
        add(dotsSpinner);
        add(linesLabel);
        add(linesCombo);
        add(createButton);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 50);
    }

}
