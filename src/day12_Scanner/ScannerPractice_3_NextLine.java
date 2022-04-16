package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // enter is recorded here if nextLine() is not used

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter your programming language: ");
        String programming = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();   // enter that user presses it records in scanner than assigns automatically to the next variable (school) variable
        scan.nextLine();            // does not let the enter to go to scanner, so the enter is not assigned to school variable

        System.out.println("Enter your school name: ");
        String school = scan.nextLine();
        scan.close();

        System.out.println("name = " + name);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
    }
}
