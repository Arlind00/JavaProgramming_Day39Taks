package day24_CustomMethods_Return;

import java.util.Locale;

public class BreakfastTasks {

    public static void main(String[] args) {


        initials("Arlind", "Bucinca");                                   // argument has to match with methods argument type
        System.out.println();

        domain("aarlind@live.com");
        System.out.println();

        monthName(5);
        System.out.println();

        dayName(3);
        System.out.println();

        dayOfMonth(2);
        System.out.println();

       // ageGruops();
        System.out.println();

        System.out.println("------------------");


        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "elimnur@cydeo.com", "gulsen@gmail.com" };

        for (String email : emails) {       // takes each strings one by one from Array and sends to method domain
            domain(email);
        }


    }


    // method to display the initials of a person
    public static void initials(String firstName, String lastName) {    // specify each time type of argument/parameter that should be provided


        // first method
        char first = firstName.toUpperCase().charAt(0);
        char last = lastName.toUpperCase().charAt(0);
        System.out.println(first + ". " + last);


        // second method
        String initio = firstName.charAt(0) + ". " + lastName.charAt(0);
        initio = initio.toUpperCase();
        System.out.println(initio);

    }


    // method to display domain of e-mail
    public static void domain(String email) {        // aarlind@live.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));     // chops the string exactly how we want
        System.out.println(domain);
    }


    // method to display name of the month on the given number
    public static void monthName(int number) {

        String name = "";

        // tests the number if its within acceptable range, if yes assigns month to name according the given argument
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "Invalid number!!!";
        }
        System.out.println("Months name: " + name);
    }


    // method to print day name based on the given number
    public static void dayName(int num) {

        String name2 = "";
        if (num >= 1 && num <= 7) {
            name2 = (num == 1) ? "Mon" : (num == 2) ? "Tue" : (num == 3) ? "Wed" : (num == 4) ? "Thur"
                    : (num == 5) ? "Fri" : (num == 6) ? "Sat" : "Sun";
        } else {
            name2 = "Invalid entry!!!";
        }
        System.out.println("Name of the day is: " + name2);
    }


    // method to print how many days a month has
    public static void dayOfMonth(int month) {

        if (month > 1 && month <= 12) {

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("Month has 31 days");
            } else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("Month has 30 days");
            }
        }else{
            System.out.println("Invalid value entered!!!");
        }
    }

}





/*
1. method for initials of a person

2. method for domain of e-mail

3. method to display name of the month on the given number

4. method to print name based on the given number

5. method to print how many days a  month has

6. method for age groups
 */