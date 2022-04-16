package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 100;
        String grade;

        if (score <= 100 && score >= 90) {
            grade = "Excellent";
        } else if (score <= 89 && score >= 80) {
            grade = "Great";
        } else if (score <= 79 && score >= 70) {
            grade = "Good";
        } else if (score <= 69 && score >= 60) {
            grade = "Passed";
        } else  {
            grade = "Failed";
        }
            System.out.println("grade = " + grade);
        }


}
