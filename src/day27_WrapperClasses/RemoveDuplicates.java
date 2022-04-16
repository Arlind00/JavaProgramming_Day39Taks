package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5,5,5,5,53,3,3,3,2,2,22,1};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        double[] arr1 = {1.0, 2.5,2.5, 3.6, 4.5, 5.3, 3.6, 4.5, 5.3};
        arr1 = removeDuplicates(arr1 );
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        char[] arr2 = {'a', 'b', '>', '%', 'b', '>', '%', '>', '%'};
        arr2 = removeDuplicates(arr2 );
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        String[] arr3 = {"asd", "asdasd", "qwrfasc","qwrfasc","qwrfasc","qwrfasc","qwrfasc"};
        arr3 = removeDuplicates(arr3);
        System.out.println(Arrays.toString(arr3));

    }




    // removes the duplicates from given array,returns new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};
        for (int each : array) {                                 // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }


    // removes the duplicates from given array,returns new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};
        for (double each : array) {                              // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }


    // removes the duplicates from given array,returns new array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {                                // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }


    // removes the duplicates from given array,returns new array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {                                 // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }
}
