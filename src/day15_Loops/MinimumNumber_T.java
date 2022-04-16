package day15_Loops;

import java.util.Scanner;

public class MinimumNumber_T {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;       // any number that users enters will be less than this value

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number...");
            int num = scan.nextInt();

            if (num < min) {
                min = num;
            }

        }
        System.out.println("min = " + min);
        scan.close();

    }
}
