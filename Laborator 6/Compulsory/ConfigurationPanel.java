package org.example;

import org.example.MainFrame;

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
        addComponents();
    }

    private void initComponents() {
        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 20, 1));
        linesLabel = new JLabel("Line probability:");
        linesCombo = new JComboBox<>(List.of(0.1, 0.3, 0.5, 0.7, 1.0).toArray());
        createButton = new JButton("Create new game");
        createButton.addActionListener(e -> {
            mainFrame.getDrawingPanel().setNumberOfDots((Integer) dotsSpinner.getValue());
            mainFrame.getDrawingPanel().setLineProbability((Double) linesCombo.getSelectedItem());
            mainFrame.getDrawingPanel().repaint();
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

