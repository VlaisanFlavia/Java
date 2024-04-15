package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Represents a player in the game.
 */
public class Player extends Thread {
    private final String name;
    private final BlockingQueue<Token> bag;
    private List<Token> sequence;
    private int points;
    private final int n;

    /**
     * Constructs a new player with the given name, bag of tokens, and length of sequence.
     *
     * @param name The name of the player.
     * @param bag  The bag of tokens from which the player will extract.
     * @param n    The length of the sequence that the player needs to form to earn points.
     */
    public Player(String name, BlockingQueue<Token> bag, int n) {
        this.name = name;
        this.bag = bag;
        this.n = n;
        this.sequence = new ArrayList<>();
        this.points = 0;
    }

    /**
     * The main method executed by the player thread.
     * It continuously extracts tokens from the bag, forms sequences, and calculates points.
     */
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Token token = bag.take();
                System.out.println(name + " extracted token: " + token);

                synchronized (sequence) {
                    sequence.add(token);

                    if (sequence.size() >= n) {
                        int sequenceValue = sequence.size();
                        System.out.println(name + " formed a sequence of length " + n + " with value " + sequenceValue);
                        points = Math.max(points, sequenceValue);
                        sequence.clear();
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Gets the points earned by the player.
     *
     * @return The points earned by the player.
     */
    public int getPoints() {
        return points;
    }
}
