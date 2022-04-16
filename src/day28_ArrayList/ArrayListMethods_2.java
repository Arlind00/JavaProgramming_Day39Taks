package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods_2 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);

        int num = 1;
        list.remove(num);                   // primitive removes by index
        System.out.println(list);

        Integer num1 = 200;
        boolean r1 = list.remove(num1);     // non primitive removes by object, can return boolean
        System.out.println(list);
        System.out.println(r1);


        System.out.println("--------------------------");


        System.out.println(list.size());
        list.clear();                       // clears all elements, size becomes 0
        System.out.println(list);


        System.out.println("--------------------------");


        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');


        int a =  characters.indexOf('A'); //0               // returns index of first variable that matches
        int b = characters.lastIndexOf('A'); //4         // returns index of last variable that matches

        System.out.println(a);
        System.out.println(b);


        System.out.println("--------------------------");



        boolean r2 =  characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);



        System.out.println("--------------------------");
        


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println("list2 = " + list2);;

        System.out.println(list1 == list2);                 // they have different memory location, they are compared according to location
        System.out.println(list1.equals(list2));            // they have same memory location, they are compared according to object



        System.out.println("-----------------------------------------");


        list1.clear();
        boolean r4 =  list1.isEmpty(); // true
        boolean r5 = list2.isEmpty();
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);


        System.out.println("-----------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );         // allows to add multiple elements to ArrayList instead of one by one

        System.out.println(numbers);



    }
}
