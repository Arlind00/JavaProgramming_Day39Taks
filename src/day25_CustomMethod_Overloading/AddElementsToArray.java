package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        array = addInteger(array, 5);                        // return of the method will we array also, hence we re-asign it to array again
        System.out.println(Arrays.toString(array));


        double[] array2 = {1.5, 2.5, 3.5, 4.5};
        array2 = addDouble(array2, 5.5);
        System.out.println(Arrays.toString(array2));

        String[] array3 = {"Tatiana", "Oleksander", "Cassandra", "Ali" };
        array3 = addString(array3, "Neira");
        array3 = addString(array3, "Arlind");
        System.out.println(Arrays.toString(array3));


        char[] array4 = {'1', '2', '3', '4'};
        System.out.println("Original array " + Arrays.toString(array4));
        array4 = addchar(array4, '5');
        System.out.println("One time changed array " + Arrays.toString(array4));
        array4 = addchar(array4, 'E');
        System.out.println("Two time changed array " + Arrays.toString(array4));
    }

    // task1
    public static int[] addInteger(int[] array, int element) {       // we need array and the element that we want to add
        int[] result = new int[array.length + 1];                    // we take old array and create a new one with length +1

        int i = 0;                                                   // index numbers of array
        for (int each : array) {
            result[i++] = each;                                      // we assign each element to the new array
        }

        result[i] = element;                                        // to last index (new array has length+1) we assign the element we wanted in empty space

        return result;
    }


    // task2
    public static double[] addDouble(double[] array2, double element) {
        double[] result = new double[array2.length + 1];

        int i = 0;
        for (double each : array2) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }


    // task3
    public static String[] addString(String[] array3, String element) {

        String[] result = new String[array3.length + 1];

        int i = 0;
        for (String each : array3) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // task4
    public static char[] addchar(char[] array4, char element) {

        char[] result = new char[array4.length + 1];

        int i = 0;
        for (char each : array4) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


}


/*
   task 1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

   task 2. create a return method called addDouble that can add a double after the last index of a double array

   task 3. create a return method called addString that can add a String after the last index of a String array

   task 4. create a return method called addChar that can add a char after last index of a char array
 */