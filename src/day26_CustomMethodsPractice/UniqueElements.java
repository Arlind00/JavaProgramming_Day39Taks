package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {


        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 4, 4, 5, 6, 69, 8, 7, 4, 5, 66, 9, 8, 4, 6, 6, 5};
        int[] unique = uniqueElements(arr);
        System.out.println(Arrays.toString(unique));


        double[] arr1 = {1.0, 1.3, 1.4, 1.5, 2.6, 2.7};
        double[] unique2 = uniqueElements(arr1);
        System.out.println("Arrays.toString(unique2) = " + Arrays.toString(unique2));


    }

    // return unique elements from integer array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};   // new int[0]                                  // we create an array for returning unique elements of given array

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {        // we call frequency method, if return is int 1 then is assigned to result
                result = ArraysUtility.addElement(result, each);            // unique elements that we got we add to result array via method
            }
        }
        return result;
    }

    // return unique elements from double array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};   // new int[0]                                  // we create an array for returning unique elements of given array

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {        // we call frequency method, if return is int 1 then is assigned to result
                result = ArraysUtility.addElement(result, each);            // unique elements that we got we add to result array via method
            }
        }
        return result;
    }

}
