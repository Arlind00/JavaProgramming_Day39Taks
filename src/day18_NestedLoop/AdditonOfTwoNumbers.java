package day18_NestedLoop;

import java.util.Scanner;

public class AdditonOfTwoNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();


            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Would you like to continue: yes/no ");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || (a.equals("no")))){     // inner loop will stop when answer is: yes or no
                System.out.println("Invalid entry please re-enter");
                a=scan.next().toLowerCase();
            }

            if(a.equals("no")){     // outer loop will stop when answer is no
                break;
            }


        }
        scan.close();
    }
}
