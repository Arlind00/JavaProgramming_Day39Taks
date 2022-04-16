package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6};                                  // add 7
        numbers = addElement(numbers, 7);                            // method returns array and creates a new array numbers

        char[] chars = {'a', 'b', 'c', 'd'};                                // add 'E'
        chars = addElement(chars, 'E');                             // method returns array and creates a new array chars


        String[] names = {"Ahmet", "Olaksandr", "Sinem", "Cihad" };        // add "Layan"
        names = addElement(names, "Layan");                         // method returns array and creates a new array names


        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));


    }


    // task1
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // task2
    public static double[] addElement(double[] array2, double element) {
        double[] result = new double[array2.length + 1];

        int i = 0;
        for (double each : array2) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }


    // task3
    public static String[] addElement(String[] array3, String element) {

        String[] result = new String[array3.length + 1];

        int i = 0;
        for (String each : array3) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // task4
    public static char[] addElement(char[] array4, char element) {

        char[] result = new char[array4.length + 1];

        int i = 0;
        for (char each : array4) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }
}
