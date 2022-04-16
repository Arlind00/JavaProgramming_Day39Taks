package day21_ForEachLoop;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i++) {          //      first loop (indexes of array)
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }


        System.out.println("------------------");


        for (int each : numbers) {         // second loop (elements of array)
            System.out.println(each);        // element in data-structure should be same as variable type within brackets
        }


    }
}
