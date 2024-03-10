package org.lab7;

public class ExplorationMap {

    private int[][] cells;
    private int n;

    /**
     * This is the constructor of the class ExplorationMap
     * @param n
     */

    public ExplorationMap(int n){
        this.n=n;
        this.cells = new int[n][n];
    }

    public synchronized void visit(int x, int y) {
        System.out.println("Visited cell (" + x + ", " + y + ")");
        cells[x][y]=1;
    }

    public synchronized boolean isVisited(int x, int y){
        return cells[x][y] == 1;
    }

    public int getSize(){
        return n;
    }
    public void addTokens(Token[] tokens) {
        for (Token token : tokens) {
            this.tokens.add(token);
        }
    }


    public void addTokens(int x, int y, Token[] tokens) {
        cells[x][y].addTokens(tokens);
    }


}
