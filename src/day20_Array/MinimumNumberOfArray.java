package day20_Array;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, -22, 20, -5};
        int min = numbers[0];

        for (int i = numbers.length - 1; i >= 0; i--) {     // ArrayName.forr: applies for loop in reverse for array

            if (numbers[i] < min) {  // if there is element in the array thats smaller than the current min number
                min = numbers[i];
            }
        }

        System.out.println(min);
    }
}
