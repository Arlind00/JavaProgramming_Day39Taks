package day27_WrapperClasses;

public class Password_T {

    public static void main(String[] args) {


        String str1 = "tamatamata1991==";


        int letters = 0;
        int upper =0;

        for (char each : str1.toCharArray()) {   // each element of array is selected

            if (Character.isLetter(each)) {      // counts the letters
                letters++;
            }





            if (each == ' '){                    // checks if password contains free spaces
                System.out.println("Password cant contain free spaces");
            }
        }

        if ((letters <= 8)) {                    // checks if letter minimum is entered
            System.out.println("Password should contain at least 8 letters");
        }


    }
}

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space

                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */