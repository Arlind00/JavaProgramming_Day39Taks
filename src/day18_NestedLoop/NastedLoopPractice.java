package day18_NestedLoop;

import java.util.Scanner;

public class NastedLoopPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age: ");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid entry, please re-enter your age ");
                age = scan.nextInt();
            }      // checks for the correct age

            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {       // while the answer is invalid
                System.err.println("Invalid entry, please re-enter. Would you like to continue");
                a = scan.next().toLowerCase();
            }       // checks for correct answer

            if (a.equals("no")) {
                break;
            }

        }
        scan.close();

    }
}
