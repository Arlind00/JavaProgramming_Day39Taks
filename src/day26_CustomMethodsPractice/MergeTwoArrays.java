package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));


        System.out.println("===========================");


        String[] str1 = {"asd", "asda", "1234rsdf" };
        String[] str2 = {"as43253d", "asdasfda", "1234r34535sdf" };
        String[] str3 = ArraysUtility.merge(str1, str2);

        System.out.println(Arrays.toString(str3));

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];      // we create a new array with length of 2 older arrays

        int i = 0;

        for (int each : arr1) {                                 // each element of array1 we assign to new array
            result[i++] = each;
        }

        for (int each : arr2) {                                 // each element of array2 we assign to new array
            result[i++] = each;
        }

        return result;

    }
}
