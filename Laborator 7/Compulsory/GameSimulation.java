package org.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Simulates a game where players extract tokens from a bag to form sequences.
 */
public class GameSimulation {
    /**
     * The main method to start the game simulation.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int numberOfPlayers = 3;
        int n = 5;

        BlockingQueue<Token> bag = new LinkedBlockingQueue<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    bag.add(new Token(i, j));
                }
            }
        }

        Player[] players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player("Player " + (i + 1), bag, n);
            players[i].start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Player player : players) {
            player.interrupt();
        }

        for (Player player : players) {
            System.out.println(player.getName() + " points: " + player.getPoints());
        }
    }
}
