package org.lab6;

import javax.swing.*;

public class ConfigPanel extends JPanel {

    final MainFrame frame;
    JLabel dotsLabel, linesLabel;
    JSpinner dotsSpinner;
    JComboBox createButton;

    /**
     * Constructor
     * @param frame
     */

    public ConfigPanel (MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        dotsLabel = new JLabel("Number of dots: ");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6,3,100,1));

    }
}
