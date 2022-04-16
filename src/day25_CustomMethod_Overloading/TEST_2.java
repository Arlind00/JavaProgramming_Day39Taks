package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class TEST_2 {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(arr1);

        System.out.println();

        double[] arr2 = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(arr2);

        System.out.println();

        char[] arr3 = {'1', '2', '3', '4', '5'};
        ArraysUtility.printEachElement(arr3);

        System.out.println();

        String[] arr4 = {"1 one ", "2 two ", "3 three", "4 four", "5 five" };
        ArraysUtility.printEachElement(arr4);

        System.out.println();

        int[] arr5 = {1, 2, 55, 89, 99, -5, 3, 4, 5};
        int max = ArraysUtility.maxNumber(arr5);
        System.out.println("max = " + max);

        System.out.println();


        double[] arr6 = {1.5, 2.9, 55.0, 89.6, 9.9, -0.5, 3, 4, 5};
        double max2 = ArraysUtility.maxNumber(arr6);
        System.out.println("max2 = " + max2);

        System.out.println();

        int[] arr7 = {1, 2, 3, 4, 5};
        boolean r1 = ArraysUtility.contains(arr7, 10);
        System.out.println(r1);

        System.out.println();

        String[] arr8 = {"1 one ", "2 two ", "3 three", "4 four", "5 five" };
        boolean r2 = ArraysUtility.contains(arr8, "equinox");
        System.out.println(r2);


    }
}
