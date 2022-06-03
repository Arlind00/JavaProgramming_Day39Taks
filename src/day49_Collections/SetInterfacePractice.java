package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {
        

        Set<Integer> hashSet = new HashSet<>();                          // random order, no index numbers,
        hashSet.addAll(Arrays.asList(10,200,300,40,90, null));           // no duplicates, accepts null
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("hashSet = " + hashSet);


        Set<Integer> linkedHashSet = new LinkedHashSet<>();                    // keeps order FILO, no index numbers
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90, null));           // no duplicates, accepts null
        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));           // ascending order, no duplicates, NO null values
        System.out.println("treeSet = " + treeSet);

    }
}
