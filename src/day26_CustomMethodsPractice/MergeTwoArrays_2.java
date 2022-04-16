package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays_2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] arr3 = merge(arr1, arr2);

        System.out.println(Arrays.toString(arr3));

    }

    // merges two int arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};          // temporary array

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);           // with method we add to new array each element from the old array1
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);          // with method we add to new array each element from the old array2
        }

        return result;
    }

}