package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays_2 {

    public static void main(String[] args) {


        // 3D arrays contains 2D arrays
        // we can store infinite numbers of 2D arrays in 3D arrays

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        //2D index number               0                                1
        //1D index number      0        1       2           0            1          2
        //element index      0 1 2    0 1 2   0 1 2       0 1 2        0 1 2      0 1 2


        System.out.println(Arrays.deepToString(arr3D));              // for printing 3D Array, from 3D Array
        System.out.println(Arrays.deepToString(arr3D[1]));           // for printing 2D Array, from 3D Array
        System.out.println(Arrays.toString(arr3D[1][1]));            // for printing 1D Array, from 3D Array
        System.out.println(arr3D[0][2][2]);                          // for printing element, from 3D Array


        System.out.println("------------------------------");


        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element + " ");
                }
                System.out.print(", ");
            }
            System.out.println();
        }


        System.out.println("----------------------------------------");



        int[][][][] arr4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}}   }   ;
        //3D index number                                       0
        //2D index number                      0                                1
        //1D index number          0          1          2              0             1            2
        //element index          0 1 2      0 1 2      0 1 2          0 1 2         0 1 2        0 1 2


        for (int[][][] each3D : arr4D) {                 // for iterating each3d Array, from 4D Array
            for (int[][] each2D : each3D) {              // for iterating each2d Array, from 3D Array
                for (int[] each1D : each2D) {            // for iterating each1d Array, from 2D Array
                    for (int element : each1D) {         // for iterating element Array,from 1D Array
                        System.out.print(element + " ");
                    }
                    System.out.println(", ");
                }
                System.out.println();
            }
            
        }

    }
}
