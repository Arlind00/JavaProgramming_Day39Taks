package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        //interview question

        String sentence = "I Love Java";
        String[] word = sentence.split(" ");

        String reverse = " ";

        // word[1] returns second word from array elements, length is for characters of that element, in our case word: Love
        for (int i = word[1].length() - 1; i >= 0; i--) {
            reverse += word[1].charAt(i);       // selected element from array, each character is reversed and assigned to variable reverse

        }

        System.out.println(reverse);

        // first method
        sentence = sentence.replaceFirst(word[1], reverse);     // replaces the first element "Love" in array with its reverse
        System.out.println(sentence);

        // second method
        word[1] = reverse;
        System.out.println(Arrays.toString(word));

        for (String each : word) {
            System.out.print(each + " ");
        }


    }
}


/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */