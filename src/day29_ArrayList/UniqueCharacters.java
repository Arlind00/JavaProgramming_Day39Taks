package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";       // non primitive

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));     // converting array to ArrayList
        System.out.println("list = " + list);


        String unique = "";

        for (String each : list) {                              // runs through all elements
            int frequency = Collections.frequency(list, each);  // runs like second loop for comparison,
            if(frequency == 1){
                unique += each;
            }
        }
        System.out.println("unique = " + unique);



    }
}
