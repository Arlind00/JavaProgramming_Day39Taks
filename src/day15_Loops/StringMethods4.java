package day15_Loops;

import java.util.Locale;

public class StringMethods4 {

    public static void main(String[] args) {

        String str = "";
        boolean r = str.isEmpty();      //if the string is empty returns True or False
        boolean r1 = str.isBlank();     //if the string is blank returns True or False
        //every empty is blank but not vice versa

        System.out.println(r);
        System.out.println(r1);

        System.out.println("-------------------------------------------");

        String s1 = "Cydeo";
        String s2 = "cydeO";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("YeS".equalsIgnoreCase("yes"));

        System.out.println("-------------------------------------------");

        String sentence = "My favorite programming languale is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.toLowerCase().contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);


        System.out.println("-------------------------------------------");

        String input = "I love Java";
        String input2 = "Java";

        System.out.println(input.equals(input2));                 // false
        System.out.println(input.equalsIgnoreCase(input2));       // false
        System.out.println(input.contains("Java"));               // true
        System.out.println(input.toLowerCase().contains("java")); // true
        System.out.println(input.toUpperCase().contains("JAVA")); // true


        System.out.println("-------------------------------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Woo");
        boolean z = a.toLowerCase().startsWith(" "); // create lower or upper case version of the string than compare it
        boolean w = a.toUpperCase().endsWith(" ");

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
