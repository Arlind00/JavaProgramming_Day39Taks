package day29_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_01 {

    public static void main(String[] args) {


        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};



        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));       // we converted from array to ArrayList
        System.out.println("list = " + list);


        list.removeIf(p -> p.length() >= 10);       // runs through all elements of arrays and eliminates according to condition
        System.out.println(list);


        countries = list.toArray(new String[0]);           // Arraylist to array
        System.out.println("countries = " + countries);
    }
}

/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */