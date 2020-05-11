package de.coding.akademie.names;

public class Rule_4_Avoid_Desinformation_and_Make_Meaningful_Distinction {

    Pair pair;  // bad

    Triple triple ;  // Clean

// Bad
  public static void copy(char a1[], char a2[]){
      for(int i=0; i<a1.length; i++)
          a2[i] = a1[i];
  }

  // Clean
    public static void copy2(char source[], char destination[]){
        for(int i=0; i<source.length; i++)
            destination[i] = source[i];
    }


    public static void main(String[] args) {


    }



    public static class Pair {  // Bad Code => Desinformation!
        Object first;
        Object second;
        Object third;
    }


    public static class Triple {  // Clean
        Object first;
        Object second;
        Object third;
    }



}
