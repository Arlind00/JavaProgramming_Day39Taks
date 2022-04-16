package day20_Array;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26];     // [Z-A]


        //     i: array index number,       q: character
        char q = 'Z';
        for (int i = 0; i < alphabets.length; i++, q--) {
            alphabets[i] = q;
        }

               // first way

/*
        for (char i = 0, j = 'Z'; i < alphabets.length; i++, j--) {
            alphabets[i] = j;
        }
*/      // second way

        System.out.println(Arrays.toString(alphabets));     // print the whole Array
        // System.out.println( alphabets[0]);                  // print the element of Array


    }
}
