package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray_2 {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));


    }


    //
    public static int[] reverse(int[] array) {

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);         // we call add method to add elements in reverse order to a new array
        }
        return result;
    }

}
