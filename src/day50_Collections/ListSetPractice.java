package day50_Collections;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        List<Integer> list = new ArrayList<>(set); // all elements from set put to ArrayList
        System.out.println(list);

        System.out.println("--------------------------");

        
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B','C','D'));

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);



    }
}
