package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a; // short b = (short)a;   its done automatically IMPLICIT CASTING
        int c = b;       // IMPLICIT CASTING
        long d = c;      // IMPLICIT CASTING
        float e = d;     //IMPLICIT CASTING

        System.out.println("--------------------");

        int x = 55;
        short y = (short)x;
        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j + " : " + k);  // not enough range in short variable (32000 max)

        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1; // hold "alt" and press "enter"
        System.out.println(d1 + " : " + s1);

        float f1 = 30.5f;
        long l1 = (long) f1;
        System.out.println(f1 + " : " + l1);





    }
}
