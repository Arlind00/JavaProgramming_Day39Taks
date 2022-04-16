package day20_Array;

public class AverageNumber {

    public static void main(String[] args) {



        int[] numbers = {10, 20, 30, 40, 50};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double averageNumber = sum / numbers.length;
        System.out.println("average number = " + averageNumber);


    }
}
