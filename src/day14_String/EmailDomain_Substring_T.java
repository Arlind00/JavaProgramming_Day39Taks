package day14_String;

import java.util.Scanner;

public class EmailDomain_Substring_T {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address please");
        String email = scan.nextLine();
        scan.close();

        String domain = email.substring( email.indexOf("@"), email.lastIndexOf(".") );

        System.out.println("Your email address domain is: "+ domain);



    }
}
