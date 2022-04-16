package day28_ArrayList;

public class DijarTask_01 {

    public static void main(String[] args) {


        System.out.println(findLongestPalindrome("001110022355888844455512315612"));

    }

    public static String findLongestPalindrome(String word) {
        String substring = "";
        int size = word.length();

        while (size > 0) {
            int firstIndex = 0;                                     // fillimi string
            int lastIndex = size;                                   // mbarimi string
            while (lastIndex <= word.length()) {
                substring = word.substring(firstIndex, lastIndex);  // creates all possible substrings
                String reverse = "";

                for (int i = substring.length() - 1; i >= 0; i--) {
                    reverse += substring.charAt(i);
                }
                if (substring.equals(reverse)) {
                    return substring;
                }
                firstIndex++;
                lastIndex++;
            }
            size--;
        }
        return "";
    }

    public static String findShortestPalindrome(String word){
        String substring = "";
        int size = 3;

        while(size<=word.length()){
            int firstIndex = 0;
            int lastIndex = size;
            while(lastIndex<=word.length()){
                substring = word.substring(firstIndex,lastIndex);
                String reverse = "";

                for(int i = substring.length()-1; i>=0; i--){
                    reverse += substring.charAt(i);
                }

                if(substring.equals(reverse)){
                    return substring;
                }
                firstIndex++;
                lastIndex++;
            }
            size++;
        }
        return "";
    }
}

