package com.example.homework6;

import java.io.Serializable;

public enum Player implements Serializable {

    NONE,
    BLUE,
    RED;

    private static final long serialVersionUID = -8059520384073698208L;

    public Player nextPlayer() {
        if (this == BLUE) {
            return RED;
        } else {
            return BLUE;
        }
    }
}

