package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {


    public static void main(String[] args) {


        String str = "bbcccaaaaa";

        Map<String, Integer> result = new LinkedHashMap<>();        // Ex: str = "bbcccaaaaa"

        String[] arr = str.split("");                         // convert string into array

        for (String each : arr) {                                               // runs each character of string
            int frequency = Collections.frequency(Arrays.asList(arr),each);     // frequency(Collection, element)
            result.put(each, frequency );                                       // put(key (each), integer (Collections))
        }

        System.out.println(result);





    }
}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */
