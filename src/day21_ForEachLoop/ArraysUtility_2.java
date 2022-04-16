package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility_2 {

    public static void main(String[] args) {

        String[] students = {"elif", "sinem", "gunay", "cihad", "david", "james", "aaron", "daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3);   // first parameter is arrayName, second parameter is how many elements we want to be copied

        System.out.println(Arrays.toString(earlyBirds));


        System.out.println("-----------------------------------------");


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(numbers));       // we can re-copy the array to its own


        System.out.println("-----------------------------------------");


        char[] ch1 = {'A', 'B', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);     // 3 parameters: array name, beginning, ending
                                                                // starting index included, ending index excluded
        System.out.println(Arrays.toString(ch2));


        System.out.println("-----------------------------------------");


        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] scores2 = Arrays.copyOfRange(scores, 3,  7);
        int[] scores3 = Arrays.copyOfRange(scores2, 0, scores2.length-1 );

        System.out.println(Arrays.toString(scores2));
        System.out.println(Arrays.toString(scores3));


    }
}

