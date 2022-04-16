package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int year = 2000;
        int number = 2;
        String result = "";


        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    result = (number % 4 == 0) ? "28 days" : "29 days";
                    /*
                    if (year % 4 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }*/
                    break;

                case 4:     // month with 30 days
                case 6:     // month with 30 days
                case 9:     // month with 30 days
                case 11:    // month with 30 days
                    //System.out.println("30 days");
                    result = "30 days";
                    break;

                default:    // month with 31 days
                    //System.out.println("31 days");
                    result = "31 days";
            }


        } else {
            result = "Invalid input";
        }
        System.out.println(result);
    }
}
