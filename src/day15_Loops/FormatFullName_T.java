package day15_Loops;

import java.util.Locale;

public class FormatFullName_T {

    public static void main(String[] args) {

       String firstName = "cyDEo";
       String lastName = "SCHOOL";


       /*
       // because it returns string it can be coded as such
      firstName =  firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() ;
                                               //C         +               // ydeo  ==> Cydeo
*/              // first method

        // we use char method which returns char, because we concatinate it to an empty string it returns string.
        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
                    //we turn this to string    to uppercase  rest to lowercase

         lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println(firstName);
        System.out.println(lastName);

    }
}


/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */