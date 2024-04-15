package com.example.homework6;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Game implements Serializable {

    private static final long serialVersionUID = 1354046783828472593L;

    private final int padding;
    private final float radius;
    private Player player;

    private List<Point> dots;
    private List<Line> lines;

    public Game(int size) {
        this.padding = 10;
        this.radius = size / 2.0f - padding * 2;
    }

    public void generate(int numberOfDots, double lineProbability) {
        this.player = Player.BLUE;
        dots = generateDots(numberOfDots);
        lines = generateLines(lineProbability, dots);
    }

    private List<Point> generateDots(int numberOfDots) {
        double step = 1.0 / numberOfDots;

        List<Point> points = new ArrayList<>();

        for (double i = 0; i <= 1; i += step) {
            Point point = generatePoint(i);
            points.add(point);
        }

        return points;
    }

    private Point generatePoint(double i) {
        double angle = i * 2.0 * Math.PI;
        double x = radius * Math.cos(angle) + radius + padding;
        double y = radius * Math.sin(angle) + radius + padding;
        return new Point(x, y);
    }

    private List<Line> generateLines(double lineProbability, List<Point> dots) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < dots.size(); i++) {
            for (int j = i + 1; j < dots.size(); j++) {
                if (Math.random() < lineProbability) {
                    Line line = new Line(dots.get(i), dots.get(j));
                    lines.add(line);
                }
            }
        }
        return lines;
    }

    public void reset() {
        for (Line line : lines) {
            line.setPlayer(Player.NONE);
        }
    }

    public boolean canSelectLine(Line line) {
        return line.getPlayer() == Player.NONE;
    }

    public void selectLine(Line line) {
        line.setPlayer(player);
        player = player.nextPlayer();
    }

    public Player checkState() {
        for (int i = 0; i < dots.size(); i++) {
            for (int j = 0; j < dots.size(); j++) {
                for (int r = 0; r < dots.size(); r++) {
                    Player fromPoint1 = playerFromPoints(dots.get(i), dots.get(j));
                    Player fromPoint2 = playerFromPoints(dots.get(r), dots.get(i));
                    Player fromPoint3 = playerFromPoints(dots.get(j), dots.get(r));

                    if (fromPoint1 == fromPoint2 && fromPoint2 == fromPoint3 && fromPoint1 != Player.NONE) {
                        return fromPoint1;
                    }
                }
            }
        }

        return Player.NONE;
    }

    private Player playerFromPoints(Point point1, Point point2) {
        for (Line line : lines) {
            if ((line.a().equals(point1) && line.b().equals(point2)) ||
                    (line.a().equals(point2) && line.b().equals(point1))) {
                return line.getPlayer();
            }
        }
        return Player.NONE;
    }


    public List<Point> getDots() {
        return dots;
    }

    public List<Line> getLines() {
        return lines;
    }

    public Player getPlayer() {
        return player;
    }

    @Override public String toString() {
        return "Game{" +
                "padding=" + padding +
                ", radius=" + radius +
                ", dots=" + dots +
                '}';
    }
}
