package day14_String;

import java.util.Scanner;

public class StartsWith_T03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word please");
        String str = scan.nextLine();
        scan.close();

        String print = "";

        if (str.startsWith("x")) {

            print = str.substring(1);
        } else {

            print = str;
        }

        System.out.println(print);

    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
        Input:
        xcode
        Output:
        code

 */