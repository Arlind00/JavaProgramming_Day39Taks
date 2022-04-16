package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char grade = 'c';
        String result = "";

        switch (grade) {

            case 'a':
                result = "excellent";
                break;

            case 'b':
                result = "great job";
                break;

            case 'c':
                result = "good";
                break;

            case 'd':
                result = "passed";
                break;

            case 'f':
                result = "failed";
                break;

            default:
                result = "invalid !!!";
        }

        System.out.println(result);

    }
}
