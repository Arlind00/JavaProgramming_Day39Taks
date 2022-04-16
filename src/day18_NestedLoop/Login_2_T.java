package day18_NestedLoop;

import java.util.Scanner;

public class Login_2_T {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter username: ");
        String u = scan.next();

        System.out.println("Please enter password: ");
        String p = scan.next();


        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Loged in");
        } else {

            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Please enter username: ");
                u = scan.next();

                System.out.println("Please enter password: ");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Loged in");
                    break;
                }
            }

            if (!(u.equals("Cydeo") && p.equals("Cydeo123"))) {
                System.err.println("Your account is locked, Please contact support team");
            }

        }
        scan.close();
    }


}

