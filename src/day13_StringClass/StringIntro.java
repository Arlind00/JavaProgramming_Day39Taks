package day13_StringClass;

import java.lang.String;   // we don't have to do, its loaded automatically (its dome implicitly)

public class StringIntro {

    public static void main(String[] args) {

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");


        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str1 == str4);

        System.out.println("--------------------------------");
    }
}
