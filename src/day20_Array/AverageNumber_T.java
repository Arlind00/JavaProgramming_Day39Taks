package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber_T {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers you want to enter: ");
        int[] numbers = new int[scan.nextInt()];
        double sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter next number: ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }


        double average = sum / numbers.length;

        System.out.println("Numbers entered by you are: " + Arrays.toString(numbers));
        System.out.println("Sum of numbers entered: " + sum);
        System.out.println("Average of numbers entered: " + average);
        scan.close();

    }
}


/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */