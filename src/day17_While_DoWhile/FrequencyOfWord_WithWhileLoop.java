package day17_While_DoWhile;

public class FrequencyOfWord_WithWhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")) {                                // as long as this condition is true
            str = str.replaceFirst("Java", "");        // replace the first java in string with ""
            frequency++;
        }

        System.out.println(frequency);


        System.out.println("-------------------------------------");

        String sentence = "cat cat cat cat cat CAT CAT cAt CaT dog dog cat cat dog dog";
        sentence = sentence.toLowerCase();
        int count = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            count++;
        }

        System.out.println(count);


        System.out.println("-------------------------------------");


        String s = " Python Java Python Python Java Python Java Python Python Java Python";
        int countJava = 0;
        int countPython = 0;

        while (s.contains("Java") || s.contains("Python")) {        // with one while loop counting 2 different things

            if (s.contains("Python")) {
                s = s.replaceFirst("Python", "");
                countPython++;
            }

            if (s.contains("Java")) {
                s = s.replaceFirst("Java", "");
                countJava++;
            }

        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

    }
}
