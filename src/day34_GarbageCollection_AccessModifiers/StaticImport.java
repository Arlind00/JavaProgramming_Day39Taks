package day34_GarbageCollection_AccessModifiers;


import static day34_GarbageCollection_AccessModifiers.Circle.* ;       // static import of pi variable

import static utilities.MathUtility.*;

public class StaticImport {


    public static void main(String[] args) {


        System.out.println(pi);                 // we can call directly because we imported it
        System.out.println(Circle.pi);          // we can call by using class
        System.out.println(numbers);            // we can call directly because we imported it


        System.out.println("---------------------");


        int r2 = sumOf2integers(10,20);         // imported from math utility
        System.out.println(r2);

        double r3 = subtractionOfTwo(20,10);    // imported from math utility
        System.out.println(r3);

        double r4 = divisionOfTwo(10,5);        // imported from math utility
        System.out.println("division " + r4);

    }
}

