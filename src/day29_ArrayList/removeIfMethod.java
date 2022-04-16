package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethod {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        list.removeIf(p -> p <= 5);               // lambda expression as argument
                                                  // p: all the elements on ArrayList

        System.out.println(list);


        System.out.println("------------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));         // remove all even elements

            list2.removeIf( each -> each%2 == 0 );          // each:         each element of the ArrayList
            System.out.println(list2);                      // (each%2 == 0) boolean condition


        System.out.println("------------------------------------");


        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf( p -> p.toLowerCase().startsWith("j"));        // removes elements start with J
        System.out.println(list3);


        System.out.println("------------------------------------");


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));


        names.removeIf( p -> !(StringUtility.isPalindrome(p)) );        // remove all the palendromes
        System.out.println(names);

        }
    }

