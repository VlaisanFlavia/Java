package com.example.homework6;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;

public class DrawingUtils {

    public static Color playerColor(Player player) {
        if (player == Player.BLUE) {
            return Color.BLUE;
        } else if (player == Player.RED) {
            return Color.RED;
        }
        return Color.GRAY;
    }

    public static Map<Ellipse2D.Double, Point> buildDots(Game game) {
        Map<Ellipse2D.Double, Point> dots = new HashMap<>();

        for (Point gameDot : game.getDots()) {
            Ellipse2D.Double dot = new Ellipse2D.Double(gameDot.x() - 5, gameDot.y() - 5, 10, 10);
            dots.put(dot, gameDot);
        }

        return dots;
    }

    public static Map<Line2D.Double, Line> buildLines(Game game) {
        Map<Line2D.Double, Line> lines = new HashMap<>();

        for (Line gameLine : game.getLines()) {
            Line2D.Double line = new Line2D.Double(gameLine.a().x(), gameLine.a().y(),
                    gameLine.b().x(), gameLine.b().y());
            lines.put(line, gameLine);
        }

        return lines;
    }

    public static boolean arePointsOnLine(Map<Ellipse2D.Double, Point> dots, Line2D.Double lineShape,
                                          Ellipse2D.Double dotShape1, Ellipse2D.Double dotShape2) {
        Point2D.Double point1 = dotToPoint(dots, dotShape1);
        Point2D.Double point2 = dotToPoint(dots, dotShape2);
        return isPointOnLine(point1, lineShape) && isPointOnLine(point2, lineShape);
    }

    private static Point2D.Double dotToPoint(Map<Ellipse2D.Double, Point> dots, Ellipse2D.Double dot) {
        Point point = dots.get(dot);
        return new Point2D.Double(point.x(), point.y());
    }

    public static boolean isPointOnLine(Point2D point, Line2D.Double line) {
        double pointDistance = line.getP1().distance(point) + line.getP2().distance(point);
        double lineLength = line.getP2().distance(line.getP1());
        double result = pointDistance - lineLength;
        // use [-0.5; 0.5] to compensate for small line
        return result >= -0.5 && result <= 0.5;
    }

}
