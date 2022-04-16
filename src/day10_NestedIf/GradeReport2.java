package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 66;

        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                : (score >= 60) ? "Passed" : "Failed"
                : "Invalid Score";

        System.out.println(result);

        System.out.println("--------------------------------------------------");

        String result2 = "";

        if (score >= 0 && score <= 100) {
         result2 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                    : (score >= 60) ? "Passed" : "Failed";
        }else {
            result2 = "Invalid Score";
        }
        System.out.println("result2 = " + result2);
    }
}
