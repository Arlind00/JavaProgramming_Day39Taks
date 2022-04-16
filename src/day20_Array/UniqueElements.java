package day20_Array;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Olga", "Adam", "Olga", "Adam", "Ahmed", "Mustafa", "Adam", "Olga"};


        for (int j = 0; j < words.length; j++) {        // selects words

            String element = words[j];
            int frequency = 0;

            for (int i = 0; i < words.length; i++) {    // compare selected word with other elements in the loop
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }
        }


    }
}
