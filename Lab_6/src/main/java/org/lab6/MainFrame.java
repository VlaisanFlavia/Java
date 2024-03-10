package org.lab6;

import javax.swing.*;

public class MainFrame extends JFrame {

    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    /**
     * Default constructor
     */
    public MainFrame(){
        super("My Drawing Application");
        init();
    }

    private void init(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
