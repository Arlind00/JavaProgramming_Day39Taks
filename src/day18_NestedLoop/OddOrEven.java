package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        while(true) {       // runs the loop if answer is yes
            System.out.println("Enter a number...");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + "is even number");
            } else {
                System.out.println(number +"is odd number");
            }       // checks if number is even or odd

            System.out.println("Would you like to enter another number");
            String answer = scan.next().toLowerCase();

            while( !(answer.equals("yes") || answer.equals("no")) ){
                System.err.println("Invalid answer, answer again ");
                answer = scan.next().toLowerCase();
            }       // checks if answer is yes/no

            if(answer.equals("no")){
                break;
            }
        }
        scan.close();
    }
}
