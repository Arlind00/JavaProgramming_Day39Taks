package day19_LoopPractices;

public class UniqueCharacters_T {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";         // bdf


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);      //  character that we are looking for
            int count = 0;                //  when ch == each ===> count++

            for (int i = 0; i < str.length(); i++) {        // compares the character that outer loop pics
                char each = str.charAt(i);      // we use to get every single character of the string

                if (ch == each) {               // condition to increase the frequency of ch
                    count++;
                }
            }
            if (count == 1) {        // if the frequency of the character is 1, than the character is unique
                result += ch;
            }
        }

        System.out.println(result);

    }
}



/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

        Ex:
        str = "aabccdeef";

        output:
        bdf
         */

