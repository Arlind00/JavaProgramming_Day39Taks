package day14_String;

import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words please ");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        scan.close();


        String word11 = word1.substring(1);
        String word22 = word2.substring(1);
        System.out.println(word11);
        System.out.println(word22);

    }

}

/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */