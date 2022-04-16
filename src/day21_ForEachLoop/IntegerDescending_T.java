package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerDescending_T {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many numbers do you want to sort");
        int[] num = new int[scan.nextInt()];            // user determines size of array
        int[] reversed = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter next number:");
            num[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));
        System.out.println("-------------------");

        for (int i = num.length - 1, j = 0; i >= 0 && j <= reversed.length - 1; i--, j++) {
            reversed[j] = num[i];

        }
        System.out.println(Arrays.toString(reversed));

        scan.close();
    }

}

/*
1. Write a program that sort the array of integer in descending order
 */