package utilities;

import java.util.Arrays;

public class StringUtility {


    // prints each of character of the String
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    // reverses given string elements and returns the reversed string
    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {               // try with i > str.length() and i>0
            result += str.charAt(i);
        }

        return result;
    }


    // checks if given string is palindrome, returns boolean
    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);                 // we call reverse method which reverses the string then compare with original string
    }


    // checks if given string is anagram, returns boolean
    public static boolean isAnagram(String str1, String str2) {      // "acb", "cba"

        char[] ch1 = str1.toCharArray();            // we don't have sort method for strings, hence we convert strings to char arrays
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);                           // we sorted both of the arrays in order to be able to compare them
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);             // we compare to arrays with each other and boolean result  we return

    }


    // removes duplicates from string, returns String
    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }

        return result;
    }


}
