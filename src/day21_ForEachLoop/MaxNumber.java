package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];


        for (int each : numbers) {
            if(each > max){
                max = each;
            }
        }


    /*    for (int i = 0; i < numbers.length; i++) {      // arrayName.fori : to create a for loop for array

            if (numbers[i] > max) {   // if there is element in the array thats greater than the current max number
                max = numbers[i];     // assigning greater number to variable max
            }
        }
*/
        System.out.println(max);

    }
}
