package org.lab7;
public class Exploration {

    private ExplorationMap map;
    private SharedMemory memory;
    private Robot[] robots;

    public Exploration(ExplorationMap map, SharedMemory memory, Robot[] robots){
        this.map = map;
        this.memory = memory;
        this.robots = robots;
    }

    public void start(){
        for(Robot robot: robots){
            //new Thread(() -> robot.explore(map,memory)).start();
            Thread thread = new Thread(robot);
            thread.start();
        }
    }

    public void pause(){
        for(Robot robot : robots) {
            robot.pause();
        }
    }

    public void resume() {
        for (Robot robot : robots) {
            robot.resume();
        }
    }

    public void stop() {
        for (Robot robot : robots) {
            robot.stop();
        }
    }
}
