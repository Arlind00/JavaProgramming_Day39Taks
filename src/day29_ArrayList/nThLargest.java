package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nThLargest {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        System.out.println(list);

        int nThNumber = 3;

        for (int i = 0; i < nThNumber; i++) {
            list.removeIf(p -> (Collections.max(list) == p));     //  removes first maximum number
        }

        int max = Collections.max(list);
        System.out.println(max);

    }
}

/*
1. write a program that can return the nth largest number from an arraylist
			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5
			output:
				4
 */