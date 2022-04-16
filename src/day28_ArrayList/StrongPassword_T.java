package day28_ArrayList;

public class StrongPassword_T {

    public static void main(String[] args) {


        // interview question
        String password = "O1-ligfsdfsdf";

        Boolean checks = isStrongPassword(password);
        System.out.println(checks);

    }

    public static boolean isStrongPassword(String password){

        boolean r1 = password.length() >= 8 && !password.contains(" ");     // first requirement
        boolean r2 = false;     // has upper case
        boolean r3 = false;     // has lower case
        boolean r4 = false;     // has special character
        boolean r5 = false;     // has digit

        char[] chars = password.toCharArray();         // creates char Array from String

        for (char each : chars) {
            if (Character.isUpperCase(each)){          // with Wrapper Character method we check for upper case
                r2 = true;
            }else if (Character.isLowerCase(each)){    // with Wrapper Character method we check for lower case
                r3 = true;
            }else if (Character.isDigit(each)){        // with Wrapper Character method we check for digits
                r4 = true;
            }else{                                     // with Wrapper Character method we check for special case
                r5 = true;
            }

            if (r2 && r3 && r4 && r5){                 // if passwords has upper, lower, digit and special character, loop should skip for checking
                break;                                 // the whole length of array
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
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
