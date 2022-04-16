package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        //   oddOrEven();            // method demands argument to complete its task

        oddOrEven(15);       // argument in brackets is needed in order the method to be able to be executed

        ageOfPerson(1991);  // birthyear argument is given in order method ageOfPerson to run

        printNumbers(5, 15);
    }

    // odd or even
    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }

    //age of person
    public static void ageOfPerson(int birthyear) {
        int age = 2022 - birthyear;
        System.out.println("Your age is: " + age);
    }

    //print numbers between X and Y
    public static void printNumbers(int x, int y) {

        if (x > y) {

            for (int i = y; i <= x; i++) {
                System.out.println(y);
                y++;
            }

        } else {
            for (int j = x; j <= y; j++) {
                System.out.println(x);
                x++;
            }
        }
    }

}


