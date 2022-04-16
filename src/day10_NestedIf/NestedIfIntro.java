package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score >= 0 && score <= 100) { // if the score is valid

            if (score >= 60) { // if student passed the exam
                System.out.println("Passed");
            } else { // if student failed the exam
                System.out.println("Failed");
            }

        } else { // if the score is not valid
            System.out.println("Invalid score");

            System.out.println("-------------------------------------");

            int age = 25;
            boolean hasId = true;

            if (hasId) { // if the person has ID
                if (age >= 21) { // if the person is 21 years and older
                    System.out.println("eligible to buy alcohol");
                } else { // if the person is less than 21 years old
                    System.out.println("Not eligible to buy alcohol");
                }
            } else {
                System.out.println("You must have an ID to buy alcohol");
            }

            System.out.println("-----------------------------------------------");


            int n = 8;
            String day;


            if (n >= 1 && n <= 7) { // if the number is valid number (1~7)
                if (n == 1) {
                    //    System.out.println("Monday");
                    day = "Monday";

                } else if (n == 2) {
                    // System.out.println("Tuesday");
                    day = "Tuesday";

                } else if (n == 3) {
                    //System.out.println("Wednesday");
                    day = "Wednesday";

                } else if (n == 4) {
                    //System.out.println("Thursday");
                    day = "Thursday";

                } else if (n == 5) {
                    //System.out.println("Friday");
                    day = "Friday";

                } else if (n == 6) {
                    // System.out.println("Saturday");
                    day = "Saturday";

                } else if (n == 7) {
                    //System.out.println("Sunday");
                    day = "Saturday";
                } else {
                    // System.out.println("Invalid");
                    day = "Sunday";
                }
                System.out.println("day = " + day);

            } else {          //if the number is not valid
                System.out.println("Number is not valid");
            }


        }
    }
}

