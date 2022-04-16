package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();                     // press Ctrl and with mouse click on the method name to go directly to the method body

        System.out.println("-------------------------");

        helloCydeo5Times();

        evenNumbers();
    }

    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }
    }

    public static void helloCydeo5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }
    }

    public static void evenNumbers() {

        for (int i = 0; i < 11; i += 2) {

            System.out.println(i);
        }
    }


}


