package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Test1 started");

        try {
            System.out.println(9 / 0);
            System.out.println("Try Block");

        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception has occurred");e.printStackTrace();
        }

        System.out.println("Test1 Completed");


        System.out.println("------------------------------");


        System.out.println("Test2 started");
        int[] numbers = {1,2,3,4,5};

        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");

        }catch (RuntimeException e){                // father of all Exceptions

           // System.out.println("catch the block");
           // System.out.println("runtime exception has occurred");
            e.printStackTrace();
            // System.out.println( e.getMessage() );
        }
        System.out.println("Test2 Completed");


        System.out.println("--------------------------------------------------");


        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 completed");


        System.out.println("--------------------------------------------------");


        System.out.println("Hello");

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");


        System.out.println("------------------------------------------");





    }
}
