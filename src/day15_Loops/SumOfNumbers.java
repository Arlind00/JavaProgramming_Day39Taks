package day15_Loops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101; i++) {        // fori shortcut to initialize a for loop
            sum += i;                           // get every number and adds to sum
        }

        System.out.println(sum);

        System.out.println("--------------------");


        Scanner scan = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            total += scan.nextDouble();                 // input of user adds to the total
        }

        System.out.println("total = " + total);
        scan.close();

    }
}
