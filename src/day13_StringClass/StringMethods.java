package day13_StringClass;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {


        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        System.out.println("---------------------------------");

        String s1 = "Batch 25 is the best batch";
        int totalCharacters = s1.length();
        System.out.println("totalCharacters = " + totalCharacters);

        char lastChar = s1.charAt(s1.length() - 1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------------------");

        String str = "wooden spoon";
        String strUp = str.toUpperCase();  // "WOODEN SPOON"

        System.out.println("strUp = " + strUp);


    }
}
