package day10_NestedIf;

public class NameOfMoth2 {

    public static void main(String[] args) {

        int num = 11;

/*
        if (num >= 1 && num <= 12) {
            if (num == 1) {
                name = "January";
            } else if (num == 2) {
                name = "February";
            } else if (num == 3) {
                name = "March";
            } else if (num == 4) {
                name = "April";
            } else if (num == 5) {
                name = "May";
            } else if (num == 6) {
                name = "June";
            } else if (num == 7) {
                name = "July";
            } else if (num == 6) {
                name = "June";
            } else if (num == 7) {
                name = "July";
            } else if (num == 8) {
                name = "August";
            } else if (num == 9) {
                name = "September";
            } else if (num == 10) {
                name = "October";
            } else if (num == 11) {
                name = "November";
            } else {
                name = "December";
            }
            System.out.println("name = " + name);
        } else {
            System.out.println("Invalid number entry");
        }
 */
        String result1 = num == 1? "Jan" : num == 2? "Feb" : num == 3? "Mar" : num == 4? "Apr"  : num == 5? "May" : num == 6? "Jun"
                        : num == 7? "Jul" : num == 8? "Aug" : num == 9? "Sep" : num == 10? "Oct" : num == 11? "Nov" : "Dec";

        System.out.println("result1 = " + result1);
    }
}
