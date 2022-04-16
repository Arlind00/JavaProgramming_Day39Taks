package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something to be reversed ");

        String str = scan.nextLine();
        String result = "";                               // contain the reverse version str

        for (int i = str.length() - 1; i >= 0; i--) {     // starts from the last index of String str,

            result += str.charAt(i);                      // takes last index number of the String str and adds to String result

        }

        System.out.println(result);
        scan.close();
    }
}


/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */