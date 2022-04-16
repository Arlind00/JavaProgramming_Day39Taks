package day24_CustomMethods_Return;

public class ReturnMethodsPractice_3 {

    public static void main(String[] args) {


        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {                // each element of the string is selected individually
            int frequency = frequency(str, str.charAt(i));      // selected element is sent to frequencyMethod and int is returned

            if(frequency==1){                                   // if returned int is unique

                System.out.println(str.charAt(i));              // it is printed that its unique
            }
        }


    }


    //unique characters form a string
    public static int frequency(String str, char ch) {      //method requires 2 different arguments to run

        int count = 0;

        for (char each : str.toCharArray()) {          // string is converted to array, with "for each loop" each char is selected
            if (each == ch) {
                count++;
            }


        }
        return count;
    }
}
