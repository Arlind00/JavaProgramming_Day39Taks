package utilities;

public class MathUtility {

    // 1. sum of two integers, returns int
    public static int sumOf2integers(int num1, int num2) {
        return (num1 + num2);
    }


    // 2. sum of two integers, returns double
    public static double sumOf2integers(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }


    // 3. subtraction of two integers
    public static int subtractionOfTwo(int num1, int num2) {
        return (num1 - num2);
    }


    // 4. subtraction of two integers
    public static double subtractionOfTwo(double num1, double num2) {
        return (num1 - num2);
    }


    // 5. multiplication of two integers
    public static int multiplicationOfTwo(int num1, int num2) {
        return (num1 * num2);
    }


    // 6. multiplication of two integers
    public static double multiplicationOfTwo(double num1, double num2) {
        return (num1 * num2);
    }


    // 7. division of two given numbers
    public static int divisionOfTwo(int num1, int num2) {
        return (num1 / num2);
    }


    // 7.1 division of two given numbers
    public static double divisionOfTwo(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }


    // 8. checks if given integer is even number
    public static boolean isEven(int num) {

        if (!(num % 2 == 0)) {
            return false;
        } else {
            return true;
        }
    }


    // 9. checks if given integer is odd number
    public static boolean isOdd(int num) {

        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }


    // 10. returns bigger between 2 integers
    public static int bigger(int num1, int num2) {

        if (num1 != num2) {

            if (num1 > num2) {
                return num1;
            }
            if (num2 > num1) {
                return num2;
            }
        }
        System.out.println("Both numbers are equal");
        return 0;
    }


    // 11. returns bigger between 2 integers
    public static double bigger(double num1, double num2) {

        if (num1 != num2) {

            if (num1 > num2) {
                return num1;
            }
            if (num2 > num1) {
                return num2;
            }
        }
        System.out.println("Both numbers are equal");
        return 0;
    }


    // 12. returns smaller between two numbers
    public static int smaller(int num1, int num2) {

        if (num1 != num2){

            if(num1>num2){
                return num2;
            }if (num2>num1){
                return num1;
            }
        }
        System.out.println("Numbers are equal");
        return 0;
    }


    // 13. returns smaller between two numbers
    public static double smaller(double num1, double num2) {

        if (num1 != num2){

            if(num1>num2){
                return num2;
            }if (num2>num1){
                return num1;
            }
        }
        System.out.println("Numbers are equal");
        return 0;
    }


    // 14. returns square of the given number
    public static int squareOfNumber(int number) {
        return (number * number);
    }


    // 15. returns square of the given number
    public static double squareOfNumber(double number) {
        return (number * number);
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
