package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "aabcccd";
        String result = "";     //a2b1c3d1

        char ch = str.charAt(0);        // 'a'
        int count = 0;

        for (int j = 0; j < str.length(); j++) {

            ch = str.charAt(j);
            count = 0;

            for (int i = 0; i < str.length(); i++) {        // find frequency of each character

                char each = str.charAt(i);      // each character of str
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains("" + ch)){      // skips the character in ch if it already is contained at result
                continue;
            }
            result += ch;
            result += count;
        }       // loops needed to get the frequency

        System.out.println(result);
    }
}

/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */