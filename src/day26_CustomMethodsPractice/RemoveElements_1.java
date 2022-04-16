package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements_1 {

    public static void main(String[] args) {


        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers,1 );          // creates new array, removes element at the given index number
        System.out.println(Arrays.toString(numbers));

        numbers = removeElement(numbers, 1);          // creates new array, removes element at the given index number
        System.out.println(Arrays.toString(numbers));
    }


    // remove element by given index number from integer array
    public static int[] removeElement(int[] array, int index) {     // element with given INDEX number will we removed

        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);                       // we terminate the whole program when invalid number is entered
        }

        int[] result = new int[array.length - 1];       // length of array is old array length -1

        int j = 0;
        for (int i = 0; i < array.length  ; i++) {
            if (i == index) {                           // if the index of array is matching with the element at given index
                continue;                               // skip
            }
            result[j++] = array[i];                     // because "for each loop" doest have index access, we assign elements to new array
        }
        return result;
    }
        }










/*

2. Create a class named RemoveElements:

	2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
			Ex:
				int[] arr = {10,20,30,40}
				removeElement(arr, 2) ==> {10, 20, 40}

	2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array

	2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

	2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array

 */