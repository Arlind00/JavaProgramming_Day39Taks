package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        // from String to Array conversion
        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars) {   // left side should be always array, right side should be data type of that array
            System.out.println(each);


        }

        System.out.println("--------------------------");


        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");   // chops String whenever there is a space

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------");


        String email = "woodenspoon@cydeo.com";
        String[] arr = email.split("@");        // splits string at @
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------");

        String s = "Today is a nice Day. Today is Monday. Today we learn Java";
        String[] sentences = s.split("\\.");
        String[] sentences1 =s.split(" ");

        System.out.println(Arrays.toString(sentences));
        System.out.println(Arrays.toString(sentences1));


    }
}
