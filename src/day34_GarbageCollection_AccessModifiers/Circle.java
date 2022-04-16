package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {


    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;


    public Circle(double radius) {
        this.radius = radius;
        //  pi = 3.14;
    }


    static {
        // radius = 5;                  // instance varialbe : compiler error
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();    // in order to set a Static variable such as ArrayList:
        numbers.add(10);                // multiple steps may be required, creating array, assigning to a variable and filling
        numbers.add(20);

    }



}
