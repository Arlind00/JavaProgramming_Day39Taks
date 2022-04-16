package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbac";

        // write a program that can check if str1 & str2 are build out of same characters
        // interview task

        // first we convert string to array
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        // secondly we sort those arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println("------------");
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        // first method (my method)
        for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
            char first = ch1[i];
            char second = ch2[j];

            if (first != second) {
                System.out.println("They are not the same!!!");
            }

        }
        System.out.println("They are completely the same");


        // second mehtod
        boolean anagram = Arrays.equals(ch1,ch2);           // compares elements of the arrays

        System.out.println("anagram = " + anagram);         //   returns true or false

    }
}



