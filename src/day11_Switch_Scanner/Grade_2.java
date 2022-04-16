package day11_Switch_Scanner;

public class Grade_2 {

    public static void main(String[] args) {

        char ch = 'e';

        switch (ch) {

            case 'a':
            case 'b':
            case 'c':
            case 'd':
                System.out.println("Passed");
                break;
            case 'f' :
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid input !!!");

        }
    }
}
