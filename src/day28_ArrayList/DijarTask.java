package day28_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class DijarTask {

    public static void main(String[] args) {

        String original = "dasdasddsadsaa";

        for (int i = 0; i < original.length(); i++) {
            for (int j = i + 1; j <= original.length(); j++) {

                if (StringUtility.isPalindrome(original.substring(i, j))) {
                    String result = new String(original.substring(i, j));
                    System.out.println("result = " + result);

                }
            }
        }
    }
}

  /*
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(original.split("")));      // org.string to ArrayList
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(reverse.split("")));       // rev.string to ArrayList
         */
/*
1.Write a program that finds the longest palindrome in a String
    Ex:
    String = "dasdasddsadsaa";
    output:
    asdasddsadsa
    asdasddsadsa
 */