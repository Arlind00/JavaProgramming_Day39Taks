package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {


        // we converted int to object in order to be able to use in other data structures other than Arrays
        int num1 = 200;
        Integer n1 = num1;      // autoboxing (done implicitly), can be done only to specific int object type

        int num2 = n1;          // unboxing (done implicitly),   can be done  to any primitive class


        System.out.println("--------------------------------------------");


        int num3 = 200;
        Integer n3 = num3;      // int primitive can only be converted to INTEGER object type

        long long4 = n3;        // ANY Wrapper object can be converted to any primitive class as long as it's within its range
        int num4 = n3;
        double double4 =n3;


        System.out.println("--------------------------------------------");


        Integer z = 999;
        Integer y = z;          // those are neither autobox nor unbox


        System.out.println("--------------------------------------------");

        int[] arr = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};

    }
}
