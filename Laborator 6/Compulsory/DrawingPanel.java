package org.example;

import org.example.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {

    private final MainFrame mainFrame;
    private Integer numberOfDots;
    private Double lineProbability;

    public DrawingPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 500);
    }

    public void setLineProbability(Double lineProbability) {
        this.lineProbability = lineProbability;
    }

    public void setNumberOfDots(Integer numberOfDots) {
        this.numberOfDots = numberOfDots;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (numberOfDots != null && lineProbability != null) {
            List<Ellipse2D.Double> dots = generateDots(numberOfDots);
            List<Line2D.Double> lines = generateLines(lineProbability, dots);

            Graphics2D g2 = (Graphics2D) g;
            drawDots(dots, g2);
            drawLines(lines, g2);
        }

    }

    private List<Ellipse2D.Double> generateDots(int numberOfDots) {
        double padding = 10;
        double radius = Math.min(800, 500) / 2.0 - padding * 2;
        double step = 1.0f / numberOfDots;

        List<Ellipse2D.Double> points = new ArrayList<>();
        for (double i = 0.0; i < 1.0; i += step) {
            Ellipse2D.Double point = getDot(padding, radius, i);
            points.add(point);
        }
        return points;
    }
    private Ellipse2D.Double getDot(double padding, double radius, double i) {
        double angle = i * 2 * Math.PI;
        double x = radius * Math.cos(angle) + radius + padding;
        double y = radius * Math.sin(angle) + radius + padding;
        return new Ellipse2D.Double(x - 5, y - 5, 10, 10);
    }

    private List<Line2D.Double> generateLines(double lineProbability, List<Ellipse2D.Double> dots) {
        List<Line2D.Double> lines = new ArrayList<>();

        for (int i = 0; i < dots.size(); i++) {
            Ellipse2D.Double doti = dots.get(i);
            for (int j = i + 1; j < dots.size(); j++) {
                if (Math.random() < lineProbability) {
                    Ellipse2D.Double dotj = dots.get(j);
                    Line2D.Double line = new Line2D.Double(doti.getX() + 5, doti.getY() + 5,
                            dotj.getX() + 5, dotj.getY() + 5);
                    lines.add(line);
                }
            }
        }
        return lines;
    }

    private void drawDots(List<Ellipse2D.Double> dots, Graphics2D g2) {
        for (Ellipse2D.Double dot : dots) {
            g2.draw(dot);
        }
    }

    private void drawLines(List<Line2D.Double> lines, Graphics2D g2) {
        for (Line2D.Double line : lines) {
            g2.draw(line);
        }
    }

}
