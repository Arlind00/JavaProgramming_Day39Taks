package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {


    //1. prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }


    //2. prints each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    //3. prints each double of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    //4. prints each String of a String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //5. find maximum number of an integer array
    public static int maxNumber(int[] numbers) {
        Arrays.sort(numbers);                         // we sort array elements in ascending order
        return numbers[numbers.length - 1];           // we return the last element of sorted array
    }


    //6. find maximum number of a double array
    public static double maxNumber(double[] numbers) {
        Arrays.sort(numbers);                         // we sort array elements in ascending order
        return numbers[numbers.length - 1];           // we return the last element of sorted array
    }


    //7. find minimum number of an integer array
    public static int minNumber(int[] numbers) {
        Arrays.sort(numbers);                       // we sort array elements in ascending order
        return numbers[0];                          // we return the first element of sorted array
    }


    //8. find minimum number of a double array
    public static double minNumber(double[] numbers) {
        Arrays.sort(numbers);                       // we sort array elements in ascending order
        return numbers[0];                          // we return the first element of sorted array
    }


    //9. check if given integer is contained in the given array
    public static boolean contains(int[] array, int number) {

        boolean result = false;

        for (int each : array) {
            if (each == number) {
                result = true;
            }
        }

        return result;
    }


    //10. check if given double is contained in the given array
    public static boolean contains(double[] array, double number) {

        boolean result = false;

        for (double each : array) {
            if (each == number) {
                result = true;
            }
        }

        return result;
    }


    //11. check if given char is contained in the given array
    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }


    //12. check if given string is contained in the given array
    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }

        return result;
    }


    //13. adds given integer element to array, returns int array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //14. adds given double element to array, returns double array
    public static double[] addElement(double[] array2, double element) {
        double[] result = new double[array2.length + 1];

        int i = 0;
        for (double each : array2) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }


    //15. adds given String element to array, returns String array
    public static String[] addElement(String[] array3, String element) {

        String[] result = new String[array3.length + 1];

        int i = 0;
        for (String each : array3) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //16. adds given char element to array, returns char array
    public static char[] addElement(char[] array4, char element) {

        char[] result = new char[array4.length + 1];

        int i = 0;
        for (char each : array4) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //17. returns the frequency of the given element from given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    //18. returns the frequency of the given element from given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    //19. returns the frequency of the given element from given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    //20. returns the frequency of the given element from given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


    //21. returns unique elements from integer array as a new array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};   // new int[0]                                  // we create an array for returning unique elements of given array

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {        // we call frequency method, if return is int 1 then is assigned to result
                result = ArraysUtility.addElement(result, each);            // unique elements that we got we add to result array via method
            }
        }
        return result;
    }


    //22. returns unique elements from double array as a new array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};   // new int[0]                                  // we create an array for returning unique elements of given array

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {        // we call frequency method, if return is int 1 then is assigned to result
                result = ArraysUtility.addElement(result, each);            // unique elements that we got we add to result array via method
            }
        }
        return result;
    }


    //23. returns unique elements from char array as a new array
    public static char[] uniqueElements(char[] array) {

        char[] result = {};   // new int[0]                                  // we create an array for returning unique elements of given array

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {       // we call frequency method, if return is int 1 then is assigned to result
                result = ArraysUtility.addElement(result, each);            // unique elements that we got we add to result array via method
            }
        }
        return result;
    }


    //24. returns unique elements from String array as a new array
    public static String[] uniqueElements(String[] array) {

        String[] result = {};   // new int[0]                                  // we create an array for returning unique elements of given array

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {       // we call frequency method, if return is int 1 then is assigned to result
                result = ArraysUtility.addElement(result, each);            // unique elements that we got we add to result array via method
            }
        }
        return result;
    }


    //25. removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);                                     // we terminate the whole program when invalid number is entered
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {                                         // if the index is not matching with given index
                result = ArraysUtility.addElement(result, array[i]);     // we add element to new array
            }
        }
        return result;
    }


    //26. removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);                                     // we terminate the whole program when invalid number is entered
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {                                         // if the index is not matching with given index
                result = ArraysUtility.addElement(result, array[i]);     // we add element to new array
            }
        }
        return result;
    }


    //27. removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);                                     // we terminate the whole program when invalid number is entered
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {                                         // if the index is not matching with given index
                result = ArraysUtility.addElement(result, array[i]);     // we add element to new array
            }
        }
        return result;
    }


    //28. removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);                                     // we terminate the whole program when invalid number is entered
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {                                         // if the index is not matching with given index
                result = ArraysUtility.addElement(result, array[i]);     // we add element to new array
            }
        }
        return result;
    }


    //29. merges the given two int arrays and returns a new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};          // temporary array

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);           // with method we add to new array each element from the old array1
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);          // with method we add to new array each element from the old array2
        }

        return result;
    }


    //30. merges the given two char arrays and returns a new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};          // temporary array

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);           // with method we add to new array each element from the old array1
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);          // with method we add to new array each element from the old array2
        }

        return result;
    }
    
    
    //31. merges the given two double arrays and returns a new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};          // temporary array

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);           // with method we add to new array each element from the old array1
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);          // with method we add to new array each element from the old array2
        }

        return result;
    }

    
    //32. merges the given two String arrays and returns a new array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};          // temporary array

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);           // with method we add to new array each element from the old array1
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);           // with method we add to new array each element from the old array2
        }

        return result;
    }


    //33. reverses the given array, returns a new array
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];                  // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {          // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }


    //34. reverses the given array, returns a new array
    public static double[] reverse(double[] array) {

        double[] result = new double[array.length];                 // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {               // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }


    //35. reverses the given array, returns a new array
    public static char[] reverse(char[] array) {

        char[] result = new char[array.length];                 // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {           // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }


    //36. reverses the given array, returns a new array
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];                 // we set new array with length of the old array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {               // we iterate array from the last element
            result[j++] = array[i];
        }
        return result;
    }


    //37. replaces the element of array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {   // name of array, index of element to be replaced, new element
        if (index < 0 || index > array.length - 1) {                        // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                           // terminates the whole program
        }
        array[index] = newElement;                                          // assign new element to array at specified index number
        return array;
    }


    //38. replaces the element of array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement) {   // name of array, index of element to be replaced, new element
        if (index < 0 || index > array.length - 1) {                                 // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                                    // terminates the whole program
        }
        array[index] = newElement;                                                   // assign new element to array at specified index number
        return array;
    }


    //39. replaces the element of array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement) {   // name of array, index of element to be replaced, new element
        if (index < 0 || index > array.length - 1) {                           // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                              // terminates the whole program
        }
        array[index] = newElement;                                             // assign new element to array at specified index number
        return array;
    }


    //40. replaces the element of array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement) {   // name of array, index of element to be replaced, new element

        if (index < 0 || index > array.length - 1) {                                 // checks is given index is valid
            System.err.println("Invalid index: " + index);
            System.exit(0);                                                    // terminates the whole program
        }

        array[index] = newElement;                                                   // assign new element to array at specified index number
        return array;
    }


    //41. replaces all the matching old-values with the new values
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i] == oldElement) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }


    //42. replaces all the matching old-values with the new values
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i] == oldElement) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }


    //43. replaces all the matching old-values with the new values
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i] == oldElement) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }


    //44. replaces all the matching old-values with the new values
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {        // checks through all array elements
            if (array[i].equals(oldElement)) {               // if any array element is equal to old element that we want to replace
                array[i] = newElement;                  // it replaces it with new element
            }
        }
        return array;
    }


    //45. removes the duplicates from given array,returns new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};
        for (int each : array) {                                 // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }


    //46. removes the duplicates from given array,returns new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};
        for (double each : array) {                              // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }


    //47. removes the duplicates from given array,returns new array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {                                // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }


    //48. removes the duplicates from given array,returns new array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {                                 // loop runs through elements of the old array
            if (!ArraysUtility.contains(result, each)) {         // starts adding elements from old array to new array with condition that assigned element is not contained at new array
                result = ArraysUtility.addElement(result, each); // if previous condition is met elements are added to new array
            }
        }
        return result;
    }


    //49. converts primitive int array into non primitive
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }return list;
    }


    //50. converts primitive double array into non primitive
    public static ArrayList<Double> convertArrayToArrayList(double[] array){

        ArrayList<Double> list = new ArrayList<>();             // declaration of variable
        for (double each : array) {
            list.add(each);                                     // assigning elements to new variable
        }return list;
    }


    //51. converts primitive char array into non primitive
    public static ArrayList<Character> convertArrayToArrayList(char[] array){

        ArrayList<Character> list = new ArrayList<>();          // declaration of variable
        for (char each : array) {
            list.add(each);                                     // assigning elements to new variable
        }return list;
    }


    //52. converts primitive boolean array into non primitive
    public static ArrayList<Boolean> convertArrayToArrayList(boolean[] array){

        ArrayList<Boolean> list = new ArrayList<>();            // declaration of variable
        for (boolean each : array) {
            list.add(each);                                     // assigning elements to new variable
        }return list;
    }
}

