package com.example.homework6;

import java.io.Serializable;

public class Point implements Serializable {

    private static final long serialVersionUID = -8489934592315567533L;

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    @Override public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
