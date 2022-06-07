package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {

    public static void main(String[] args) {


        String str = "aabcccdeeeef";
        String [] arr = str.split("");          // convet string into array

        Map<String, Integer> result = new LinkedHashMap<>();
        for (String each : arr) {                                               // run through array
            int frequency = Collections.frequency(Arrays.asList(arr),each);     // convert array to list for frequency argument
            if(frequency ==1){
                result.put(each,1);
            }
        }
        System.out.println(result);





    }
}


/*
1. Write a program that can find the unique characters from a String

			Ex:
					str = "aabcccdeeeef";

			output:
					{b=1, d=1, f=1}

 */