package day23_CustomMethods_Void;

public class CustomMethodsIntro {

    public static void main(String[] args) {

        System.out.println("Test started");

        greeting();         // we call the method we created, Java jumps at the method, executes it, returns from where it left at main

        System.out.println("Test completed");

    }

    public static void greeting(){          // methods should not contain another method, should not be inside another method

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");

    }

}
