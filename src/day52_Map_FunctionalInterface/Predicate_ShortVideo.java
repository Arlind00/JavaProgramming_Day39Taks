package day52_Map_FunctionalInterface;

import java.util.function.Predicate;

public class Predicate_ShortVideo {

    public static void main(String[] args) {

        Predicate<Integer> isEven = a ->  a%2 ==0;          // no need for creation of another interface
        boolean r1 = isEven.test(300);

        System.out.println(r1);


        Predicate<String> isPalindrome = str->{                     // checks if given word is palindrome
            String reversed = "";
            for (int i = str.length()-1; i>=0; i--){                // reverses given word
                reversed += str.charAt(i);                          // assigns to new variable
            }
            boolean result = str.equalsIgnoreCase(reversed);        // compare original and reversed word
            return result;
        };
        boolean r2 = isPalindrome.test("toodEn Spoon");            // we give a word to check
        System.out.println(r2);
    }
}
