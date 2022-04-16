package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe_T {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me? yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no") )) {
            System.err.println("Invalid answer, please re-enter again");
            System.out.println("Will you marry me? yes/no");
            answer = scan.next().toLowerCase();
        }

            if( answer.equals("yes")){
                System.out.println("Congrats");
            }else{
                System.out.println("Goodbye");
            }

        scan.close();
    }
}
