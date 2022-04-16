package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles: ");
        float miles = scan.nextFloat();
        scan.close();

        float km = (float) (miles * 1.60934);
        System.out.println(miles + " miles equals to " + km + " kilometers");

    }

}


/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */