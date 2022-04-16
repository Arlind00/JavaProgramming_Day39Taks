package day20_Array;

import java.util.*;

public class ClassMates_T {

    public static void main(String[] args) {

        String[] names = {"Harry Potter", "Alastor Mudy", "Albus Dumbledore", "Minerva McGonigall", "Rubeus Hagrid",
                "Gandalf Grey", "Sam Gamgie", "Tomb Raider", "Saruman Wise", "Fatos Nano"};


        for (String each : names) {

            String initial = each.charAt(0) + "" + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);

        }
    }


}




/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */