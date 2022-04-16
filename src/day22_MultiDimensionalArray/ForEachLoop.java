package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {


        //element index:  0  1  2    0  1  2  3    0  1   2   3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //arrays index:      0             1                2

        // only when we dont need to sort or re-arrange elements of the MultiDimensionalArray
        for (int[] each1DArray : arr2D) {                       // to select each array of MultiDimensionalArray
            for (int eachElement : each1DArray) {               // to select each element of each selected array
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }


    }
}
