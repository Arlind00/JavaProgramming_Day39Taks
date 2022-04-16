package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp_Tasks {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));         // we convert array of values into a COLLECTIONS type

        System.out.println("origigal: " + numbers);
        Collections.swap(numbers, 0, numbers.size() - 1);     // we swap places of first and last element
        System.out.println("Swaped:   " + numbers);


        System.out.println("-----------------------------------------");


        //  REMOVING 0 ELEMENTS WITHOUT USING SECOND ARRAYLIST
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int size = list.size();         // original size of arraylist

        list.removeAll(Arrays.asList(0));   // removed all zeros
        System.out.println("removed zeros: " + list);

        int newSize = list.size();  // new size of arraylist
        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println("final version: " + list);


        System.out.println("-----------------------------------------");

        //  REMOVING 0 ELEMENTS USING SECOND ARRAYLIST
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {                // non 0 elements are added into second arraylist
            if (each != 0) {
                result.add(each);
            }
        }
        System.out.println("result = " + result);


        for (Integer each : list2) {                // 0 elements are added into second arraylist
            if (each == 0) {
                result.add(each);
            }
        }
        System.out.println("result = " + result);


        System.out.println("-----------------------------------------");


        String str = "ABCD123$%#@&456EFG!";
        
        ArrayList<Character> chars = new ArrayList<>();     // all chars from string array are stored in char ArrayList

        for (int i = 0; i < str.length(); i++) {        // converted string into char array
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);    // add all the characters
        letters.removeIf(p-> ( !Character.isLetterOrDigit(p)));          // remove character that are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);     // add all the characters
        digits.removeIf( p-> (!Character.isDigit(p)) );           // remove character that are not letters
        System.out.println("digits =  " + digits);


        ArrayList<Character> specialChar = new ArrayList<>(chars);
        specialChar.removeAll( digits );
        specialChar.removeAll(letters);
        System.out.println("specialChar = " + specialChar);

    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */