package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {


        int maxNumber = max(100, 200);

        System.out.println(maxNumber);

        int multiplication = maxNumber * 2;
        System.out.println(multiplication);


    }

    public static int max(int x, int y) {

        int result = 0;


        if (x > y) {
            result = x;
        } else {
            result = y;
        }

        return result;          // returns number stored in result whenever the max method is used
    }


}


