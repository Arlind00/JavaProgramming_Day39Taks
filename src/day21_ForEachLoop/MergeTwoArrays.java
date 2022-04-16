package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {


        // interview task
        String[] group1 = {"Ali", "Layan", "Aysenur"};   //3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat"};   //5

        // firstly we initiate a array with correct length
        String[] student = new String[group1.length + group2.length];           // length of array is equal to length of 2 arrays 8


        int i = 0;
        // copies elements of first array to third array
        for (String each : group1) {        //"Ali", "Layan", "Aysenur"
            student[i++] = each;
        }
        // copies elements of second array to third array
        for (String each : group2) {        //"Maria", "Aygun", "Duygu", "Suat"
            student[i++] = each;
        }

        System.out.println(Arrays.toString(student));


        System.out.println("----------------------------------");


        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] ch3 = new char[ch1.length + ch2.length];         //  length of first 2 arrays is equal to length or 3rd new one

        int j = 0;
        // copies elements of first 2 arrays to third array
        for (char every : ch1) {        // 'A', 'B', 'C'
            ch3[j++] = every;
        }


        // copies elements of first array to third array
        for (char every : ch2){     //'D', 'E', 'F', 'G', 'H'
            ch3[j++] = every;
        }

        System.out.println(Arrays.toString(ch3));

    }
}

/*
. Write a program that can merge 2 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};


			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */