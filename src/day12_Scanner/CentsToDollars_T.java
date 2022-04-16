package day12_Scanner;

import java.util.Scanner;

public class CentsToDollars_T {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of money in cents to be converted to dollars: ");
        int money = scan.nextInt();
        scan.nextLine();
        scan.close();

        int dollars = money/100;
        int cents = money % 100;

        System.out.println(money + "equals to:" + dollars + " $ and " + cents + " cents" );
    }
}


/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225
                output:
                225 cents equal to: 2 dollars and 25 cents
 */
