package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 5;
        String grade = "";  // or String grade;  in this form may give compiler error

        if (score >= 0 && score <= 100) { // if the score is valid

            if ( score >= 90) {          // false, score < 90
                grade = "Excellent";
            } else if (score >= 80) {    // false, score < 80
                grade = "Great";
            } else if (score >= 70) {    // false, score < 70
                grade = "Good";
            } else if (score >= 60) {    // false, score < 60
                grade = "Passed";
            } else {                     // if the score is NOT valid
                grade = "Failed";
            }
            System.out.println("grade = " + grade);
        } else {
            System.out.println("Invalid score !!!");
        }
    }
}

