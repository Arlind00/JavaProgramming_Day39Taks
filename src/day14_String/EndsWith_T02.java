package day14_String;

import java.util.Scanner;

public class EndsWith_T02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();
        scan.close();

        String print = "";


        if (word.endsWith("ly")) {

            print = "really???";
        } else {
            print = "never mind";
        }

        System.out.println(print);


    }
}

/*
    2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */