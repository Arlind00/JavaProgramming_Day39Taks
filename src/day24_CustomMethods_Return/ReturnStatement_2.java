package day24_CustomMethods_Return;

public class ReturnStatement_2 {

    public static void main(String[] args) {

        monthName(15);

    }

    // method to display name of the month on the given number
    public static void monthName(int number) {

        String name = "";


        if (number < 1 || number > 12) {
            System.out.println("Invlid!!");
            return;                         // exits the method when if statement is true
        }

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


}
