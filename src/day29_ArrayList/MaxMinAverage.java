package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverage {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);


        int max = list.get(0);          // we assume first element is max number
        int min = list.get(0);
        int sum = 0;

        for (Integer each : list) {
            if (max < each) {
                max = each;            // we assign bigger number to max
            }

            if (min > each) {
                min = each;            // we assign smaller number to min
            }

            sum += each;
        }

        double average = (double) sum / list.size();

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);

    }
}
