package day17_While_DoWhile;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BranchIfStatement {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");      // A B C D E F
            if (i == 'F') {
                break;      // exits the loop
            }
        }


        System.out.println();
        System.out.println("------------------------------------------------------");


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number ");
            int number = scan.nextInt();

            if (number < 0) {
                break;
            }
        }


    }
}
