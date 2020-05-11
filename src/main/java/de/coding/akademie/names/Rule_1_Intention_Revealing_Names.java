package de.coding.akademie.names;

import java.util.ArrayList;
import java.util.List;

public class Rule_1_Intention_Revealing_Names {

    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;
    List<int[]> theList = new ArrayList<>();  // Bad

    List<int[]> gameBoard = new ArrayList<>(); // Clean
    List<Cell> gameBoard2 = new ArrayList<>(); // Clean


    int d; // elapsed time in days  : bad code

    int elapsedTimeInDays ;  // clean code

 // Bad Code !!
    public List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<int[]>();
        for(int[] x : theList)
            if(x[0] == 4)
                list1.add(x);
            return list1;
    }

    public List<int[]> getFlaggedCells(){
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for(int[] cell : gameBoard)
            if(cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }


    public List<Cell> getFlaggedCells2(){
        List<Cell> flaggedCelles = new ArrayList<Cell>();
        for(Cell cell : gameBoard2)
            if(cell.isFlagged())
                flaggedCelles.add(cell);
            return flaggedCelles;
    }












}
