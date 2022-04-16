package day11_Switch_Scanner;

public class NumberToWords_2 {

    public static void main(String[] args) {

        int number = 4;
        String word = "";

        switch (number) {
            case 0:
                word = "zero";
                break;

            case 1:
                word = "one";
                break;

            case 2:
                word = "two";

            case 3:
                word = "three";
                break;

            case 4:
                word = "four";
                break;

            case 5:
                word = "five";
                break;

            case 6:
                word = "six";
                break;

            case 7:
                word = "seven";
                break;

            case 8:
                word = "eight";
                break;

            case 9:
                word = "nine";
                break;

            default:
                word = "incorrect input!!!";


        }
        System.out.println(word);

    }
}
