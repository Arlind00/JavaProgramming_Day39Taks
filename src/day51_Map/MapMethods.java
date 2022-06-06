package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {


        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);         // this one will be accepted in list

        System.out.println(students);
        System.out.println("size= " + students.size());


        System.out.println( "socre="+ students.get("Alex"));        // display the score of Alex:
        System.out.println();


        students.replace("Ali", 90 );           // replace Ali' score to 90
        System.out.println(students);

        students.remove("Alex");
        System.out.println(students);

        students.remove("Ozan");
        System.out.println(students);


        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);


        boolean r3 = students.containsValue(97);
        System.out.println("r3= " + r3);


        System.out.println("is empty= " + students.isEmpty());


        System.out.println("-------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);                          // put all elements from one map to another one

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);


        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 ==  map2);                  // incorrect way to compare elements (by memory location)
        System.out.println(map1.equals(map2));              // correct way to compare elements (by value)

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);


    }
}
