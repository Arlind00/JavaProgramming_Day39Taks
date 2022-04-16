package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("Enter user for full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNo = scan.next();
        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.next();
        scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        scan.nextLine();
        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNo = " + buildingNo);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

    }
}

/*
1. Enter user for full name
2. Enter your building number
3. enter your street name
4. enter your city name
5. enter your state
6. enter your zip code
display shipping adress
 */