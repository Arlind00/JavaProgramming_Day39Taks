package day17_While_DoWhile;

import java.util.Scanner;

public class Calclulator_T {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter numbers to be added...");

        int number = scan.nextInt();
        int sum = number;

        if (number >= 0) {

            while (number >= 0) {
                System.out.println("Enter numbers to be added...");
                number = scan.nextInt();
                sum += number;
                System.out.println("sum = " + sum);
            }

        } else {

            System.out.println("Total sum of numbers is: " + sum);
        }
    }
}



/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

        hint: you need an infinite loop

 */