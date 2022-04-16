package day11_Switch_Scanner;

public class NumbersToWords {

    public static void main(String[] args) {

        int number = 7;
        String result = (number >= 0 && number <= 9)?
                        (number == 0)? "Zero" :(number == 1)? "One" :(number == 2)? "Two" :(number == 3)? "Three"
                       :(number == 4)? "Four" :(number == 5)? "Five" :(number == 6)? "Six" :(number == 7)? "Seven"
                       :(number == 8)? "Eight" : "Nine"
         :"Invalid Numer!!!";

        System.out.println(result);











/*
        int number = 7;
        String word = "";

        boolean isValid = number == 0 || number == 1 || number == 2 || number == 3 || number == 4 || number == 5
                || number == 6 || number == 7 || number == 8 || number == 9;

        if (isValid) {
            if (number == 0) {
                word = "Zero";
            } else if (number == 1) {
                word = "One";
            } else if (number == 2) {
                word = "Two";
            } else if (number == 3) {
                word = "Three";
            } else if (number == 4) {
                word = "Four";
            } else if (number == 5) {
                word = "Five";
            } else if (number == 6) {
                word = "Six";
            } else if (number == 7) {
                word = "Seven";
            } else if (number == 8) {
                word = "Eight";
            } else {
                word = "Nine";
            }


        } else {  // precondition
            word = "Invalid number entered !!!";
        }
        System.out.println(word);
        */


    }
}

/*
Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */