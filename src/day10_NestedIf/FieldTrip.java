package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 3; // 1~6
        String location = "";
        int groupNo = 1;
        String teacher = "";

        if (grade >= 0 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                groupNo = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNo = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                groupNo = 5;
                teacher = "Mr. Wilson";
            } else if (grade == 4) {
                location = "Aquarium";
                groupNo = 5;
                teacher = "Mr. Wilson";

            } else {
                System.out.println("Invalid grade input!!!");
            }
            System.out.println("location - " + location + "\nnumber of groups - " + groupNo + "\nteacher in charge - " + teacher);


        }
    }
}