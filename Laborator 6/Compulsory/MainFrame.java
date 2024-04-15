package org.example;
import org.example.ConfigurationPanel;
import org.example.DrawingPanel;
import org.example.ControlPanel;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;

public class MainFrame extends JFrame {

    private ConfigurationPanel configurationPanel;
    private DrawingPanel drawingPanel;
    private ControlPanel controlPanel;

    public MainFrame() {
        super("Position game");
        init();
    }

    private void init() {
        initPanels();
        addPanels();
    }

    private void initPanels() {
        configurationPanel = new ConfigurationPanel(this);
        drawingPanel = new DrawingPanel(this);
        controlPanel = new ControlPanel(this);
    }

    private void addPanels() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        add(configurationPanel, NORTH);
        add(drawingPanel, CENTER);
        add(controlPanel, SOUTH);
    }

    public ConfigurationPanel getConfigurationPanel() {
        return configurationPanel;
    }

    public DrawingPanel getDrawingPanel() {
        return drawingPanel;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }
}
