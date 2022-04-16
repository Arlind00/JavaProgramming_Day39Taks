package day17_While_DoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog cAt CaT CAT";

        int frequency = 0;

        for (int i = 0; i <= str.length() - 3; i++) {                    // limits the length of str accordingly with searched word length not to give out of index error
            String eachSub = str.substring(i, i + 3);                    // creates new substrings from main str
            //  System.out.println(eachSub);

            if (eachSub.equalsIgnoreCase("cat")) {
                frequency++;
            }

        }
        System.out.println(frequency);


    }
}
