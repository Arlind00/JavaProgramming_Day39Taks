package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        //element index:  0  1  2    0  1  2  3    0  1   2   3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //arrays index:      0             1                2

        System.out.println(Arrays.deepToString(arr2D));     // printing complete multidimensional array

        // in order to print all elements of multidimensional array
        for (int i = 0; i < arr2D.length; i++) {               // i: index numbers of single dimensional arrays
            // System.out.println(Arrays.toString(arr2D[i]));  // printing array by array a

            for (int j = 0; j < arr2D[i].length; j++) {        // j: index number of elements
                System.out.print(arr2D[i][j] + " ");           // printing all elements of the multidimensional array
            }
            System.out.println();
        }


    }
}
