package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class TEST_1 {

    public static void main(String[] args) {


        String str = "Java Programming language";

        StringUtility.printEachChar(str);          // we import the method by writing the Class name where the method is located

        str = StringUtility.reverse(str);          // we put str as argument to reverse method, it reverses elements which we
        // which we re-assign to str
        System.out.println(str);


        System.out.println("--------------");


        String s1 = "Wooden Spoon";
        s1 = StringUtility.reverse(s1);           // string argument is given, string is returned and re-assigned to string
        System.out.println(s1);


        System.out.println("--------------");


        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);        // string argument is given, method checks is its palindrome
        System.out.println("palindrome = " + palindrome);               // and returns boolean


        System.out.println("--------------");


        // count number of palendromes in array
        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo" };

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {                    // in if condition we call palindrome for given array
                count++;
            }

        }
        System.out.println("Number of palindromes: " + count);


        System.out.println("----------------------------------");

        String str4 = "aaaaaaaaaaaabvfsdfewasfsax";

        str4 = StringUtility.removeDuplicates(str4);

        System.out.println(str4);


    }
}
