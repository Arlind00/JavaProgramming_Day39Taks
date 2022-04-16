package day06_PrimitiveTypeCastings;

import org.w3c.dom.ls.LSOutput;

public class ArithmeticOperations {

    public static void main(String[] args) {

        System.out.println("12" + 1); //121 concatination
        System.out.println(10 + 20);  //30 addition
        System.out.println(100 - 50); //50 subtraction
        System.out.println(10 * 6);   //60 multiplication
        System.out.println(100 / 3);  //33 division
        System.out.println(10.0 / 4); //2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10d / 4);  //2.5


        int a = 100;
        double b = a/6;   //16.0
        System.out.println(b);

        double c = a/6.0; // or c = a/6d or c = double(a)/6.0
        System.out.println(c);


        System.out.println(100d / 13);


        /*
         int / int = integer
         dec / int = decimal
         int / dec = decimal
         dec / dec = decimal
         */

    }

}
