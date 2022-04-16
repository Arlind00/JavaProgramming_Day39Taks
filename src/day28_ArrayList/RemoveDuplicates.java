package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        System.out.println(list);


        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {                   // go through all elements of ArrayList
            if (result.contains(each)) {              // no same elements are assigned to ArrayList result
                continue;
            }
                result.add(each);
        }
        System.out.println(result);
    }
}