package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        System.out.println("Please enter the radius of the circle in cm: ");

        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        scan.close();               // always close the scan command

        double perimeter = r*2*3.14f;
        double area = r*r*3.14f;

        System.out.println("Area of the circle is: " + perimeter + " cm");
        System.out.println("Perimeter of the circle is: " + area + " cm");


    }
}
