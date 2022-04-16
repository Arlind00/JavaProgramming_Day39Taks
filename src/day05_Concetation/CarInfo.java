package day05_Concetation;

public class CarInfo {

    public static void main(String[] args) {

        int year = 1964;
        String make = "Ford";
        String model = "Shelby/Eleanor";
        String miles = "10000 miles";
        String color = "Grey";
        String price = "$45000";

        String carInfo = year + " " + make + " " + model + ", " + miles + ", " + color + ", " + price + ".";
        System.out.println(carInfo);


    }
}
/*
Create a class called CarInfo, that prints those info mentioned below
            1964 Ford Shelby/Eleanor, 10000 miles, Grey, $45000.

 */