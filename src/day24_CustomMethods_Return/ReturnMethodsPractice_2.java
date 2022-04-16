package day24_CustomMethods_Return;

public class ReturnMethodsPractice_2 {

    public static void main(String[] args) {

        String str1 = grade(76);        //value that is returned from method we can assign to another variable

        System.out.println(str1);


        if (str1.equals("A")) {
            System.out.println("Excellent");
        } else if (str1.equals("B")) {
            System.out.println("Great");
        } else if (str1.equals("C")) {
            System.out.println("Good");
        } else if (str1.equals("D")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");

        }
    }





    //create a function that can calculate the grade
    public static String grade(int score) {


        String result = "";

        if (score < 0 || score > 100) {
            result = "Invalid";
        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }

        return result;

    }
}

/* if grade 'A' ===> excellent
            'B' ===> great
            'C' ===>
 */