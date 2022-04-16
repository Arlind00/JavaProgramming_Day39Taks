package day20_Array;

import java.util.Arrays;

public class ArraysPractice_2 {

    public static void main(String[] args) {


        char[] letters = new char[26];

        //[A~Z]

        // first method
        for (char i = 'A', j = 0; i <= 'Z' && j <= letters.length; i++, j++) {       // i variable is used for char
            letters[j] = i;                                                         // j variable for numb. from 0 to 26
        }

        System.out.println(Arrays.toString(letters));
        System.out.println("----------------------");


        // second method
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }

        System.out.println(Arrays.toString(letters));


        System.out.println("--------------------------");
        char[] letters2 = new char[26];     // [Z-A]

        char q = 'Z';
        for (int i = letters2.length - 1; i >= 0; i--) {
            letters2[i] = q--;

        }
        System.out.println(Arrays.toString(letters2));



        /*
        for (char i = 65; i <91; i++) {
            letters[i] =char[i];

        }
*/
    }
}
