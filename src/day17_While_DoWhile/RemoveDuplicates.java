package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = " AABBCC";
        String result = "";         // ABC


        for (int i = 0; i < str.length() - 1; i++) {
            String ch = " " + str.charAt(i);         // contains method only accepts String data type
            // A A B B C C                           // we convert char to string

            if (result.contains(ch)) {
                continue;
            }
            result += ch;
        }
        System.out.println(result);

    }
}
