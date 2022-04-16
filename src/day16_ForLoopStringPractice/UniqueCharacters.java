package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";


        for (int i = 0; i < str.length(); i++) {           // index numbers of the str (starting from 0)

            char ch = str.charAt(i);                            // ch: each character if str
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {       // compares indexOf and lastIndex to find if it is unique
                result += ch;
            }
        }
        System.out.println(result);

    }
}
