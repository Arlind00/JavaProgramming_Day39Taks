package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray_T {

    public static void main(String[] args) {

        // interview question
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};          //   we want 50 40 30 20 10

        int[] reversed = new int[numbers.length];      // length of both arrays should be equal in length with first array

        for (int i = numbers.length-1, j=0 ; i >= 0 && j<= reversed.length-1; i--, j++) {       // loop for reversing array elements into descending
             reversed[j] = numbers[i];

        }




        System.out.println(Arrays.toString(reversed));

    }
}
