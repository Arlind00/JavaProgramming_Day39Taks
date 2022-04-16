package day11_Switch_Scanner;

import java.util.Scanner;

public class Diki {

    public static void main(String[] args) {

        /*
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        if ((num1 <= num2 && num1 >= num3) || (num1 <= num3 && num1 >= num2)) {
            System.out.println("Medium value is:" + num1);
        }

        if ((num2 <= num1 && num2 >= num3) || (num2 >= num1 && num2 <= num3)) {
            System.out.println("Medium value is:" + num2);
        }

        if ((num3 <= num2 && num3 >= num1) || (num3 <= num2 && num3 >= num1)) {
            System.out.println("Medium value is:" + num3);
        }
*/      // Task e Dikit

        Scanner scan = new Scanner(System.in);

        for(int i = 1; true; i++){
            System.out.println("Enter first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter second number:");
            int num2 = scan.nextInt();
            System.out.println("Enter third number:");
            int num3 = scan.nextInt();

            System.out.println("Median: "+num2);

        }
    }
}
