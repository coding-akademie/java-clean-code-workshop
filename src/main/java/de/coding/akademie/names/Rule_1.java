package de.coding.akademie.names;

import java.util.ArrayList;
import java.util.List;

public class Rule_1 {

    List<int[]> theList = new ArrayList<>();


    int d; // elapsed time in days  : bad code

    int elapsedTimeInDays ;  // clean code


    public List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<int[]>();
        for(int[] x : theList)
            if(x[0] == 4)
                list1.add(x);
        return list1;
    }

}
