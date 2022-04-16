package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));

        String[] str1 = {"asd", "asda", "1234rsdf" };
        str1 = reverse(str1);
        System.out.println(Arrays.toString(str1));


    }




    // reverses the given array, returns a new array
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];                           // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {       // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }
    // first way of reversing
/*

    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];                           // we set new array with length of the old array

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {       // we iterate array from the last element
            result[j] = array[i];
        }
        return result;
    }
    */


    // reverses the given array, returns a new array
    public static double[] reverse(double[] array) {

        double[] result = new double[array.length];                 // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {                 // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static char[] reverse(char[] array) {

        char[] result = new char[array.length];                 // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {                 // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }


    // reverses the given array, returns a new array
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];                 // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {                 // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }


}
