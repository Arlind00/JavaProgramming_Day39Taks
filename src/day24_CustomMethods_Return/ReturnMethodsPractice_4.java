package day24_CustomMethods_Return;

public class ReturnMethodsPractice_4 {

    public static void main(String[] args) {


        String str = "aaabbcccc";

        str = removeDuplicates(str);
        System.out.println(str);

    }

    public static String removeDuplicates(String str) {     // method should return a String value (result variable0


        String result = "";

        for (int i = 0; i < str.length(); i++) {            // runs through all elements of the string
            char each = str.charAt(i);                      // assigns elements of string to each

            if (!result.contains("" + each)) {              // if element in each is not already at result, add it to result
                result += each;                             // we convert each to string by adding "" to be able te use contain method
            }

        }
        return result;
    }

}






/*
1. create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"

 */