package day19_LoopPractices;

public class FirstDuplicateChar {

    public static void main(String[] args) {

        String result = "";
        String str = "aabccdeef";

        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (each == ch) {
                    count++;
                }

                if (count >= 2) {
                    result += ch;
                }

            }
            System.out.println(result);

        }
    }
}




/*
2. 1. Write a program that can return the first duplicated character from a string
        Ex:
        str = "aabccdeef";

        output:
        bdf
         */