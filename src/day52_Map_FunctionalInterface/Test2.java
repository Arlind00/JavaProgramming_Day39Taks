package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {



        MySecondFunctionalInterface<String> printEach = s -> {                              // MySecondFunctionalInterface<T>
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden Spoon");


        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);         // same method different parameter type
        cube.test(5);




    }
    }

