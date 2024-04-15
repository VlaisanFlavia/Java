package com.example.homework6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Optional;

import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import static javax.swing.BorderFactory.createEtchedBorder;

public class DrawingPanel extends JPanel {

    private BufferedImage image;
    private Graphics2D graphics;
    private int width;
    private int height;

    private Map<Ellipse2D.Double, Point> dots;
    private Map<Line2D.Double, Line> lines;

    private Ellipse2D.Double selectedDotShape;
    private Game game;

    public DrawingPanel(int width, int height) {
        this.width = width;
        this.height = height;
        init(width, height);
    }

    private void init(int width, int height) {
        createImage();
        setPreferredSize(new Dimension(width, height));
        setBorder(createEtchedBorder());
        addMouseListener(mouseAdapter());
    }

    private void createImage() {
        image = new BufferedImage(width, height, TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
        resetScreen();
    }

    private void resetScreen() {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);
    }

    public void newGame(Game game) {
        this.game = game;
        this.selectedDotShape = null;
        resetScreen();

        // build and paint dots
        buildDots(game);
        paintDots();

        // build and paint lines
        buildLines(game);
        paintLines();

        // refresh screen
        repaint();
    }

    private void buildDots(Game game) {
        dots = DrawingUtils.buildDots(game);
    }

    private void paintDots() {
        graphics.setColor(Color.BLACK);
        for (Ellipse2D.Double dot : dots.keySet()) {
            graphics.draw(dot);
        }
    }

    private void buildLines(Game game) {
        lines = DrawingUtils.buildLines(game);
    }

    private void paintLines() {
        for (Map.Entry<Line2D.Double, Line> line : lines.entrySet()) {
            Color color = DrawingUtils.playerColor(line.getValue().getPlayer());
            graphics.setPaint(color);
            graphics.draw(line.getKey());
        }
    }


    private MouseAdapter mouseAdapter() {
        return new MouseAdapter() {

            @Override public void mouseClicked(MouseEvent event) {
                Point2D point = event.getPoint();

                // check if a dot is clicked
                Optional<Ellipse2D.Double> shapeDot = findShapeDot(point);
                shapeDot.ifPresent(selected -> dotShapeSelected(selected));
                if (shapeDot.isPresent()) {
                    return;
                }

                // check if a line is clicked
                Optional<Line2D.Double> line = findLineShape(point);
                line.ifPresent(selected -> lineShapeSelected(selected));
                if (line.isPresent()) {
                    return;
                }

                // click not on dot or line -> resetSelectedDot
                resetSelectedDotShape();
            }
        };
    }

    private Optional<Ellipse2D.Double> findShapeDot(Point2D point) {
        return dots.keySet().stream()
                .filter(dot -> dot.contains(point))
                .findAny();
    }

    private void dotShapeSelected(Ellipse2D.Double dotShape) {
        if (selectedDotShape == null) {
            // First dot selected
            selectDotShape(dotShape);
        } else {
            // Second dot selected -> try to for a line
            Optional<Line2D.Double> lineShape = findSelectedLineFromDots(dotShape);
            lineShape.ifPresent(this::selectGameLine);
            // Reset selected dot
            resetSelectedDotShape();
        }
    }

    private void selectDotShape(Ellipse2D.Double dot) {
        selectedDotShape = dot;
        drawSelectedDotShape(selectedDotShape);
    }

    private Optional<Line2D.Double> findSelectedLineFromDots(Ellipse2D.Double dotShape) {
        return lines.keySet().stream()
                .filter(line -> DrawingUtils.arePointsOnLine(dots, line, dotShape, selectedDotShape))
                .findAny();
    }

    private Optional<Line2D.Double> findLineShape(Point2D point) {
        return lines.keySet().stream()
                .filter(line -> DrawingUtils.isPointOnLine(point, line))
                .findAny();
    }

    private void lineShapeSelected(Line2D.Double line) {
        selectGameLine(line);
        resetSelectedDotShape();
    }

    private void selectGameLine(Line2D.Double lineShape) {
        Line gameLine = lines.get(lineShape);
        if (game.canSelectLine(gameLine)) {
            // get color for line and draw
            Color color = DrawingUtils.playerColor(game.getPlayer());
            drawLine(lineShape, color);

            // mark line selected
            game.selectLine(gameLine);

            // check if any player won the game
            Player player = game.checkState();
            if (player != Player.NONE) {
                JOptionPane.showMessageDialog(null, player);
            }
        }
    }

    private void drawLine(Line2D.Double lineShape, Color color) {
        graphics.setColor(color);
        graphics.draw(lineShape);
        repaint();
    }

    private void resetSelectedDotShape() {
        resetDot(selectedDotShape);
        selectedDotShape = null;
    }

    private void resetDot(Ellipse2D.Double dotShape) {
        if (dotShape != null) {
            graphics.setColor(Color.WHITE);
            graphics.fill(dotShape);
            graphics.setColor(Color.BLACK);
            graphics.draw(dotShape);
            repaint();
        }
    }

    private void drawSelectedDotShape(Ellipse2D.Double dotShape) {
        graphics.setColor(Color.PINK);
        graphics.fill(dotShape);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

    public BufferedImage getImage() {
        return image;
    }
}
