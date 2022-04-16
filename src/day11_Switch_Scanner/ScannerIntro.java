package day11_Switch_Scanner;

import java.util.Scanner;        // before using Scanner we should import "util" under package java

public class ScannerIntro {

    public static void main(String[] args) {

        System.out.println("enter an integer: ");

        Scanner input = new Scanner(System.in);  // shortcut: Scan + enter
        int num1 = input.nextInt();     // allows input to be taken from user , then assigns it to a variable

        System.out.println("enter a decimal:");
        double num2 = input.nextDouble();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Multiplication: " + (num1 + num2));

        input.close();      // closes the scanner, after this cant use the scanner anymore

    }

}
