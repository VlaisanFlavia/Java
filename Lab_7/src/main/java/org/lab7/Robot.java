package org.lab7;

import java.util.Random;

public class Robot {

    private String name;
    private Random random;

    public Robot(String name) {
        this.name = name;
        this.random = new Random();
    }

    public void explore(ExplorationMap map, SharedMemory memory){

        int n = map.getSize();
        int x = random.nextInt(n);
        int y = random.nextInt(n);

        while(true) {

            int dx = random.nextInt(3) - 1;
            int dy = random.nextInt(3)-1;

            int nx = x + dx;
            int ny = y + dy;

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && !map.isVisited(nx,ny)){

                synchronized (map) {
                    map.visit(nx,ny);
                }

                for(int i = 0; i < n; i++){

                    Token token = memory.extractToken();
                    synchronized (map){
                        map.storeToken(nx,ny,token);
                    }
                }

                x = nx;
                y = ny;
            }
        }
    }
}
