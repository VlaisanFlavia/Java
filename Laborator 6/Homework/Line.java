package com.example.homework6;


import java.io.Serializable;

public class Line implements Serializable {

    private static final long serialVersionUID = -3451212677057737386L;

    private final Point a;
    private final Point b;
    private Player player = Player.NONE;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point a() {
        return a;
    }

    public Point b() {
        return b;
    }

    public Player getPlayer() {
        return player;
    }

    public Line setPlayer(Player player) {
        this.player = player;
        return this;
    }
}

