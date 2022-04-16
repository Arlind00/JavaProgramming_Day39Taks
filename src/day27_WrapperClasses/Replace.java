package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        arr = replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        double[] arr1 = {1.0, 2.5, 3.6, 4.5, 5.3};
        arr1 = replace(arr1, 2 , 36.00);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        char[] arr2 = {'a', 'b', '>', '%'};
        arr2 = replace(arr2, 2, '5' );
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        String[] arr3 = {"asd", "asdasd", "qwrfasc"};
        arr3 = replace(arr3, 2, "555" );
        System.out.println(Arrays.toString(arr3));




    }



    public static int[] replace(int[] array, int index, int newElement) {   // name of array, index of element to be replaced, new element
        if (index < 0 || index > array.length - 1) {                        // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                           // terminates the whole program
        }
        array[index] = newElement;                                          // assign new element to array at specified index number
        return array;
    }


    public static double[] replace(double[] array, int index, double newElement) {   // name of array, index of element to be replaced, new element
        if (index < 0 || index > array.length - 1) {                                 // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                                    // terminates the whole program
        }
        array[index] = newElement;                                                   // assign new element to array at specified index number
        return array;
    }


    public static char[] replace(char[] array, int index, char newElement) {   // name of array, index of element to be replaced, new element
        if (index < 0 || index > array.length - 1) {                           // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                              // terminates the whole program
        }
        array[index] = newElement;                                             // assign new element to array at specified index number
        return array;
    }


    public static String[] replace(String[] array, int index, String newElement) {   // name of array, index of element to be replaced, new element

        if (index < 0 || index > array.length - 1) {                                 // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                                    // terminates the whole program
        }

        array[index] = newElement;                                                   // assign new element to array at specified index number
        return array;
    }



}











/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

 */