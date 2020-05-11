package de.coding.akademie.names;

public class Cell {

    int[] fields;
    private static final int FLAGGED = 4;


    public boolean isFlagged() {
        return fields[0] == FLAGGED;
    }
}
