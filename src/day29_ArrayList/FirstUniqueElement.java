package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);


        for (Integer each : list) {             // outer loop,call each element of the ArrayList

            int frequency = 0;
            for (Integer element : list) {      // inner loop,  compares "each" element with every element of Array
                if (element == each) {
                    frequency++;                // increase frequency every time is a match
                }
            }

            if (frequency == 1){                // if frequency is 1 (unique, print)
                System.out.println(each);
                break;                          // after we find first unique element we exit the loop
            }
        }
    }
}

/*
1. Write a program that can return the first unique elements from an arraylist
			Do not use indexOf & lastIndexOf methods


 */