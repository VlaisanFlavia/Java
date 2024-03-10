package org.lab6;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {

    final MainFrame frame;
    final static int W = 800, H = 600;

    public DrawingPanel(MainFrame frame){
        this.frame = frame;
        initPanel();
    }

    private void initPanel(){
        setPreferredSize(new Dimension(W,H));
        setBorder(BorderFactory.createEtchedBorder());
    }

    @Override
    protected void paintComponent(Graphics g){

    }

}
