package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 7: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();        // variable type == nextType
                                         // we can implicit and explicit casting for scan

        String result = "";

        if (num >= 1 && num <= 7) {

         result = (num == 1)?"Monday" :(num == 2)?"Tuesday" :(num == 3)?"Wednesday"
                 :(num == 4)?"Thursday" :(num == 5)?"Friday" :(num == 6)?"Saturday"
                 : "Sunday";

        } else {
            result = "invalid number!!!";
        }

        System.out.println(result);
        scan.close();
    }
}
