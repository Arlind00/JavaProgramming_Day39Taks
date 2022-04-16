package day15_Loops;

import java.util.Scanner;

public class StarstWithX_T {

    public static void main(String[] args) {

        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();  //if we have only one input from user

        // in order to use string methods back to back we should be sure to return a String
        String result = word.replace("x", "a").replace("x", "a");

        System.out.println(result);

}
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */