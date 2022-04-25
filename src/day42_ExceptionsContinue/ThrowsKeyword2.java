package day42_ExceptionsContinue;

public class ThrowsKeyword2 {


    public static void main(String[] args) throws ArithmeticException {

        System.out.println("Test started");

        System.out.println(8/0);            // unchecked exception (can't be handled by throws Keyword)

        System.out.println("Test completed");


    }
}
