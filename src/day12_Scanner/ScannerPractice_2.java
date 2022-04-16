package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_2 {

    public static void main(String[] args) {

        
        //System.out.println("Enter true or false");

         Scanner input = new Scanner(System.in);
         //boolean result = input.nextBoolean();

        System.out.println("Enter your name: ");
        String name = input.next();     // reads the input till the space only
        input.close();

        System.out.println("name = " + name);
        
    }
}
