package day15_Loops;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class MaximumNumber_T {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int max = -2147483648;      //minimum number that integer can be assigned, so that it is compared with the user input

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num > max) {    //if user entered number is greater than current max number
                max = num;
            }
        }

        System.out.println("maxNum = " + max);
        scan.close();

    }
}

/* Write a programm that asks user to enter a number 5 times.
    return the max number.
 */