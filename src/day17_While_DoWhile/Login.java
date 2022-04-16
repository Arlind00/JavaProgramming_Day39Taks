package day17_While_DoWhile;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // Username: Cydeo
        // Password: Cydeo123

        System.out.println("Enter Username: ");
        String u = scan.nextLine();

        System.out.println("Enter password");
        String p = scan.nextLine();


        if (u.equals("Cydeo") && p.equals("Cydeo123")) {        // if credentials are valid, the user logs in
            System.out.println("Logged in");
        } else {
            int attempts = 3;

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {      // while the credentials are invalid and user has attempts left
               if (attempts == 1){
                   System.err.println("THIS IS THE LAST CHANCE");
               }
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter Username: ");
                u = scan.nextLine();

                System.out.println("Enter password");
                p = scan.nextLine();
                attempts--;
            }

            if (u.equals("Cydeo") && p.equals("Cydeo123")) {        // if credentials are valid, the user logs in
                System.out.println("Logged inn");
            } else {
                System.err.println("Account locked");
                scan.close();

            }
        }

    }
}

