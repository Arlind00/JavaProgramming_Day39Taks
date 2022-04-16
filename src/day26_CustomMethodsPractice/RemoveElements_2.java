package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements_2 {


    public static void main(String[] args) {


        int [] array = {4,5,56,3,2,45,865};
        array = removeElement(array, 5);
        System.out.println(Arrays.toString(array));



    }

    //  removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);                                     // we terminate the whole program when invalid number is entered
        }
        
        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if ( i !=index){                                         // if the index is not matching with given index
            result = ArraysUtility.addElement(result, array[i]);     // we add element to new array
            }
        }
        return result;
    }

}

