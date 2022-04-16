package day07_Operators;

import jdk.swing.interop.SwingInterOpUtils;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println(num1 > 0); // true
        System.out.println(num1 < 0); // false

        System.out.println("---------------------------------");

        int a = 25;
        ++a;           // pre increment: increases the value by 1 right away
        System.out.println(a);

        --a;          // pre decrement: decrease the value by 1 right away
        System.out.println(a);

        System.out.println("---------------------------------");
        int b = 100;
        System.out.println(++b);

        int c = 100;
        System.out.println(c++);  // post increment
        System.out.println(c);    // result of the post incrementation

        System.out.println("---------------------------------");
        int x = 200;
        --x;                     // pre decremend x= 199
        System.out.println(--x); // pre decrement x=198

        int y = 200;
        System.out.println(y--); // post decrement printed   y= 200
        System.out.println(y);   // result of the decrement  y= 199



        int z = 45;
        System.out.println(++z); // pre increment z= 46
        System.out.println(z++); // post increment z= 46
        System.out.println(z);   // z= 47
        System.out.println(z--); // post decrement z=47
        System.out.println(z);   // z= 46


    }
}
