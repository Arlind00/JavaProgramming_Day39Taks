package day29_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,89,9,54,2));

        ArrayList<Integer> unique = new ArrayList<>();

        // first method
        for (Integer each : list) {                         // outer loop
          int freq = Collections.frequency(list, each);     // behaves like inner loop, compares Array from within

            if (freq == 1){
                unique.add(each);
            }
        }
        System.out.println("unique = " + unique);


        System.out.println("-------------------------------------");

        // second method
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,2,3,3,4,5,6,6,87,5,2,12,1,3,5,7887));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);                // we add all elements from list1 into list2
        unique2.removeIf( p -> (Collections.frequency(list2,p) > 1) );      // remove all the elements that are not unique
        System.out.println("unique2 = " + unique2);




    }
}
