package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray_2 {

    public static void main(String[] args) {

        //element index:  0  1  2    0  1  2  3    0  1   2   3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //arrays index:      0             1                2


        for (int i = arr2D.length - 1; i >= 0; i--) {           // outer loop selects arrays from Multidimensional array (in reverse order)
            for (int j = 0; j < arr2D[i].length; j++) {         // inner loop selects elements of selected arrays
                System.out.print(arr2D[i][j] + " ");            // prints elements one by one
            }
            System.out.println();                               // after one array is finished it starts from new line to new array
        }

        System.out.println("---------------------------------------");


        for (int i = 0; i < arr2D.length; i++) {                // i: index of arrays of MultiDimensionalArray
            for (int j = arr2D[i].length - 1; j >= 0; j--) {    // j: index of elements of arrays selected by outer loop
                System.out.print(arr2D[i][j] + " ");            // with i and j selected by outer and inner loop, each element of MultiDimensionalArray is printed
            }
            System.out.println();
        }

        System.out.println("---------------------------");


        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }



    }
}


/*
    task1: 9 10 11 12 13
           4  5  6  7  8
           1  2  3

 */

/* task2
            3   2   1
            8   7   6   5   4
            13  12  11  10  9
 */

/*
task 3
        13  12  11  10  9
        8   7   6   5   4
        3   2   1

 */
