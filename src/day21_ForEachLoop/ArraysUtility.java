package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));      //  {1,2,3,4,5};
        System.out.println(nums[0]);

        System.out.println("-----------------------------------------");

        int[] scores = {95, 100, 55, 65, 85, 78};

        System.out.println(Arrays.toString(scores));    // before sorting
        Arrays.sort(scores);                            //  [55, 65, 78, 85, 95, 100]
        System.out.println(Arrays.toString(scores));    // after sorting

        System.out.println("Min score: " + scores[0]);
        System.out.println("Max score: " + scores[scores.length - 1]);


        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Ahmet", "Gunay", "Zuhal", "Zana", "Maria", "Sinem"};        // print according to alphabet
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------");

        String[] names2 = {"Anna", "ANNA"};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));    //   prints according to ASCII table reference number

        System.out.println("-----------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);       // compares arrays accordin to theyr content order, returns boolean true/false
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2);      //
        System.out.println(r2);


        System.out.println("-----------------------------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'c', 'a'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);



    }
}
