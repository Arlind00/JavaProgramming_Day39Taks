package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 50;
        int b = 9;
        int count = 0;


            while (a >= b) {
                a -= b;         // 30-7= 23-7= 16-7= 9-7 =2
                count++;        // 1 + 1 + 1 + 1 = 4
            }

            System.out.println(count + "with a remainder of: " + a);


    }
}
