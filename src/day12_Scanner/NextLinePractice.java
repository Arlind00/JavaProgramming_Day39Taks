package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //2. Enter is saved here.

        System.out.println("Enter your age");
        int age = scan.nextInt();              //1. 19 and press Enter(enter is saved at scanner)
        scan.nextLine();                       //4. in order to prevent the Enter to be assigned to fullName

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();     //3. enter is assigned here (this is a bug)

        System.out.println("Enter your GPA:");
        double gpa = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your school name");
        String name = scan.nextLine();
        scan.close();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("name = " + name);

    }
}
/*
1.ask user to enter the enter age (nestInt())
2.ask user to enter the full name (nextLine())
 */