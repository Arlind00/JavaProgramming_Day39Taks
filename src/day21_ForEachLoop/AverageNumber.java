package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};
        int total= 0;

        for (int each : numbers) {
             total += each;
        }
        double average = total/numbers.length;

        System.out.println(total);
        System.out.println("Average is : " + average);
    }
}
