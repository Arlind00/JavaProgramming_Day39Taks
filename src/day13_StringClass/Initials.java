package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your first name: ");
        String firstName = scan.next();


        System.out.println("Write your surname: ");
        String lastName = scan.next();
        scan.close();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String a1 = "asdasd";
        String b1 = "1231412";
        String c1 = a1 +" "+ b1;
        System.out.println("c1 = " + c1);

        System.out.println("your initials are " + f + "." + l);


    }
}
