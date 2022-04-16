package day20_Array;

import java.util.Arrays;

public class MonthsName {

    public static void main(String[] args) {


        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // index     0      1      2      3      4      5      6      7      8      9     10      11

        for (int i = 0; i < months.length; i++) {      // i represents the index numbers of arrays  from 0
            System.out.println(months[i]);
        }

        System.out.println("------------------------------------------");
        for (int i = months.length-1; i >= 0 ; i--) {      // i represents the index numbers of arrays  from 0
            System.out.println(months[i]);
        }


        /*
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);

*/
    }
}
