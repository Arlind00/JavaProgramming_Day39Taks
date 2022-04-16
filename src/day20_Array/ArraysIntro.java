package day20_Array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {


        // create a variable thats capable to contain 5 names
        String[] myGroup = new String[5];                       // number of bracket pairs indicates number of dimensions of array
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Hulya";
        myGroup[3] = "Suat";
        myGroup[4] = "Michael";
        //myGroup[5] = "Muhtar";            //cant add 5th name because arrays size is 5 cant be changed


        // System.out.println(myGroup);                         // wrong way of printing arrays
        System.out.println(Arrays.toString(myGroup));           // "Gunay","Neira","Hulya","Suat","Michael"


        System.out.println("-----------------------------------------------------------------");
        System.out.println();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index            0          1          2             3          4         5           6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 || number > 7) {
            System.out.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);



    }
}
