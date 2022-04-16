package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 4, 5};
        arr = replaceAll(arr, 4, 1);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        double[] arr1 = {1.0, 2.5, 3.6, 4.5, 5.3};
        arr1 = replaceAll(arr1, 2.5 , 36.00);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        char[] arr3 = {'a', 'b', '>', '%'};
        arr3 = replaceAll(arr3, 'b', '5' );
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        String[] arr4 = {"asd", "asdasd", "qwrfasc"};
        arr4 = replaceAll(arr4, "asd", "555" );
        System.out.println(Arrays.toString(arr4));

    }

    // replaces all the matching old-values with the new values
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i] == oldElement) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }


    // replaces all the matching old-values with the new values
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i] == oldElement) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }


    // replaces all the matching old-values with the new values
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i] == oldElement) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }


    // replaces all the matching old-values with the new values
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i].equals(oldElement)) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }

}


/*
2. ReplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}

 */