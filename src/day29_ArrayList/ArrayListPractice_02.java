package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_02 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));
        System.out.println(employees);


        System.out.println("--------------------------------------------------------------");


        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        System.out.println("names = " + names);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println(list);

        list.removeIf(p -> p.charAt(0) == 'M');             // removes the element if it starts with M
        System.out.println("list = " + list);

        names = list.toArray(new String[0]);                // converted from ArrayList to array
        System.out.println(Arrays.toString(names));

    }
}
