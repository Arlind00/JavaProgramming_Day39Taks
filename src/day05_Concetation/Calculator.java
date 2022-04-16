package day05_Concetation;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

        // 100 + 50 = 150
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) );
        System.out.println(firstNumber + " + " + secondNumber + " = " + addition );
        System.out.println("");

        // 100 - 50 = 50
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println("");
        // 100 * 50 = 500
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication );
    }
}
