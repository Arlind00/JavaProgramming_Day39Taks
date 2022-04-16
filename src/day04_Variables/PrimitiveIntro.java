package day04_Variables;

public class PrimitiveIntro {

    public static void main(String[] args) {

        //age: 38 years old
        byte age = 38;

        //weight: 160 punds
        // byte weight = 160; 160 is out of byte range
        short weight = 160;

        // salary: 100000 $
        //short salary = 100000; // 100000 is out of short range
        int salary = 100_000; //int is prefered data type for integer numbers

        //when using int and the number is too large, we add L or l at the end of the number
        long asset = 3_333_333_333L;

        //tax: 0.26, when number is larger than the float we add F or f at the end
        float tax = 0.26F;

        double PI = 1.26;


    }


}
