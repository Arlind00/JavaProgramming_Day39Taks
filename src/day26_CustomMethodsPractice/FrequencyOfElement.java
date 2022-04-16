package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 4, 4, 5, 6, 69, 8, 7, 4, 5, 66, 9, 8, 4, 6, 6, 5};
        int n = frequencyOfElement(arr, 3);
        System.out.println("frequency = " + n);





    }

    // returns the frequency of the given element from given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


}
