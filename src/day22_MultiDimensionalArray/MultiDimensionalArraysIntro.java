package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Harun", "Jahja"};
        String[] group3 = {"Emanuael", "Eleanor", "Shelby"};


        String[][] groups = new String[3][];       //index: 0, 1, 2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(groups));        // toString() is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));    // for multi-dimensional arrays

        System.out.println("---------------------------------");


        // 2D arrays may have infinite number of 1 dimensional arrays
        // int[3][] arra ==> this array has 3 one dimensional arrays
        // int[3][2] arra ==> this array has 3 one dimensional arrays

        //element index:  0  1  2    0  1  2  3    0  1  2    3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //arrays index:      0             1                2

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));      // when we print the whole array, we use single dimensional form
        System.out.println(arr2D[2][3]);        //







    }
}
