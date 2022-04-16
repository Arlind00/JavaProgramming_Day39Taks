package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod_1 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);    //0                             // implicitly (autoboxing) new elements to Arraylist
        numbers.add(20);    //1
        numbers.add(30);    //3
        numbers.add(40);    //4
        numbers.add(50);    //6

        numbers.add(2, 25);  //2               // adds new element to index 2, shifts older 2 into 3rd index
        numbers.add(5, 45);  //5               // adds new element to index 5, shifts older 5 into 6th index
        System.out.println(numbers);


        System.out.println("---------------------------");


        System.out.println(numbers.size());
        int lastIndex = numbers.size() -1;
        System.out.println("lastIndex = " + lastIndex);


        System.out.println("---------------------------");


        int num = numbers.get(3);                           // unboxing
        Integer n1 = numbers.get(3);                        // no conversion is happening
        System.out.println(numbers.get(3));                 // returns integer number with given index from ArrayList


        System.out.println("---------------------------");

        for (int i = 0; i < numbers.size(); i++) {          // get all the elements from the ArrayList
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();
        System.out.println("---------------------------");


      ArrayList<String> list = new ArrayList<>();
      list.add("Java");
      list.add("Python");
      list.add("Java");
      list.add("C#");
      list.add("Ruby");
        System.out.println(list);

        list.set(2, "Java Script");                 // replaces the element at given index with new one
        list.set(3, "C++");
        System.out.println(list);


        System.out.println("---------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
        System.out.println(employees);

        employees.remove(0);         // removes first element of ArrayList
        System.out.println(employees);

        employees.remove(employees.size()-1);       // removes the last element
        System.out.println(employees);

        employees.remove(3);
        System.out.println(employees);

        boolean r2 = employees.remove("Neira");      // removes element by object
        System.out.println(employees);
        System.out.println(r2);

        boolean r1 = employees.remove("olga");      // can be assigned to a boolean
        System.out.println(employees);
        System.out.println(r1);




















    }
}
