package day26_CustomMethodsPractice;

import utilities.MathUtility;

public class TestMath {

    public static void main(String[] args) {


        int num1 = 1;
        int num2 = 3;

        int result = cubeOfNumber(num1);
        System.out.println(result);

        result = cubeOfNumber(num2);
        System.out.println(result);
        System.out.println();


        double num3 = -2.5;
        double num4 = -0.2;


        double result2 = cubeOfNumber(num3);
        System.out.println(result2);


    }


    // 16. returns square of the given number
    public static int cubeOfNumber(int number) {
        return (number * number * number);
    }


    // 17. returns square of the given number
    public static double cubeOfNumber(double number) {
        return (number * number * number);




    }


}

/*
            2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers
			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals
			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals
			2.7 Create a method that passes two double parameters and return the division result
			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number
			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers
			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers
			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double
			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */
