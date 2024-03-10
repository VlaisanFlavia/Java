package org.lab7;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        ExplorationMap map = new ExplorationMap(n);
        SharedMemory memory = new SharedMemory(n);
        Robot[] robots = {new Robot("R1"), new Robot("R2"), new Robot("R3")};
        Exploration exploration = new Exploration(map, memory, robots);

        exploration.start();
    }
}