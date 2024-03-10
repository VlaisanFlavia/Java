package org.lab7;

import java.util.*;

public class SharedMemory {

    private List<Token> tokens;
    private Random random;

    public SharedMemory(int n){

        List<Token> tempTokens = new ArrayList<>();

        for(int i = 1; i < n * n * n; i++){
            tempTokens.add(new Token(i));
        }

        Collections.shuffle(tempTokens);
        this.tokens = tempTokens;
        this.random = new Random();

    }

    public synchronized Token extractToken(){
        if(tokens.isEmpty()) {
            return null;
        }
        return tokens.remove(0);
    }

    public synchronized void addTokens(Token[] tokensToAdd){
        tokens.addAll(Arrays.asList(tokensToAdd));
        notifyAll();

    }
}