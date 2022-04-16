package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 33;
        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11; // months that ahve 30 days
        boolean has31Days = !has28Days && !has30Days; // if month has not 28 and 30 days

        if (has28Days){
            System.out.println("28 days");
        }

        if (has30Days){
            System.out.println("30 days");
        }

        if (has31Days){
            System.out.println("31 days");
        }

    }
}
/*
    int month = 3;
    boolean days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        if (days){
                System.out.println("31 days");
                }

                if (!days){
                System.out.println("30 days");
                }
 */


/*
3. Write a program that can print the number of days in a month
			Ex:
				number = 1 ~ 12;
			output:
				31 Days
			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */