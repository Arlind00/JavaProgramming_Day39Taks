package day24_CustomMethods_Return;

public class ReturnStatement {

    public static void main(String[] args) {

    nameOfDay(10);

    }


    // method to print name of the day based on the given number
    public static void nameOfDay(int number) {

        if (number < 1 || number > 7) {       // if the number is invalid
            System.out.println("Invalid!!");
            return;                           // exits nameOfDay method (when used in void it just exits the method)
        }

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tue");
        } else if (number == 3) {
            System.out.println("Wed");
        } else if (number == 4) {
            System.out.println("Thur");
        } else if (number == 5) {
            System.out.println("Fri");
        } else if (number == 6) {
            System.out.println("Sat");
        } else {
            System.out.println("Sun");
        }


    }


}
