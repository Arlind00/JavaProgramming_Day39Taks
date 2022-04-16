package day11_Switch_Scanner;

public class NameOfMonth {

    public static void main(String[] args) {

        int month = 5;
        String name = " ";

        switch (month) {
            case 1:
                //System.out.println("january");
                name = "january";
                break;

            case 2:
                //System.out.println("february");
                name = "february";
                break;

            case 3:
                //System.out.println("march");
                name = "march";
                break;

            case 4:
                //System.out.println("april");
                name = "april";
                break;

            case 5:
                //System.out.println("may");
                name = "may";
                break;

            case 6:
                //System.out.println("june");
                name = "june";
                break;

            case 7:
                //System.out.println("july");
                name = "july";
                break;

            case 8:
                //System.out.println("august");
                name = "august";
                break;

            case 9:
                //System.out.println("september");
                name = "september";
                break;

            case 10:
                //System.out.println("october");
                name = "october";
                break;

            case 11:
                //System.out.println("november");
                name = "november";
                break;

            case 12:
                //System.out.println("december");
                name = "december";

            default:
                //System.out.println("Invalid input number!!!");
                name = "invalid input!!!";

        }
        System.out.println(name);
    }
}
