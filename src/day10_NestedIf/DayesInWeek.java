package day10_NestedIf;

public class DayesInWeek {

    public static void main(String[] args) {
            
        int n =3;
        
        /*
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
        } else if (n ==7) {
            //System.out.println("Sunday");
            day = "Saturday";
        } else {
            // System.out.println("Invalid");
            day = "Sunday";
        }
        System.out.println("day = " + day);
    }
        */

        String result = ( n == 1 )? "Monday" :( n == 2 )? "Tuesday" :( n == 3 )? "Wednesday" :( n == 4 )? "Thursday" :( n == 5 )? "Friday"
                       :( n == 6 )? "Saturday" : "Sunday";

        System.out.println("result = " + result);
    }
}
