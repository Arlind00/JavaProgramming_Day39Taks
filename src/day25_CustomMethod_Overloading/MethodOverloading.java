package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);                              // example of method overloading, similar functionality
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray = {0.5, 1.5, 2.5, 4.5};
        Arrays.sort(doubleArray);                           // example of method overloading, similar functionality
        System.out.println(Arrays.toString(doubleArray));

        char[] charArray = {'a', 'b', 'd', 's', 'q'};
        Arrays.sort(charArray);                             // example of method overloading, similar functionality
        System.out.println(Arrays.toString(charArray));


        double sum1 = sumOfNumbers(2.5, 5.5, 6.5);                             // we called our own methods
        System.out.println(sum1);

        int sum2 = sumOfNumbers(10, 20, 30, 40);
        System.out.println(sum2);

        int sum3 = sumOfNumbers(55,99);
        System.out.println(sum3);

    }


    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }


    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }


    // we can use in this form also
    public static double sumOfNumbers(double num1, double num2, double num3) {
        return sumOfNumbers(num1, num2) + num3;
    }


    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }


    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }


}

