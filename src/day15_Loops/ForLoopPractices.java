package day15_Loops;

public class ForLoopPractices {

    public static void main(String[] args) {


        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Hello");

        System.out.println("--------------------------------------------------");

        for (int j = 100; j >= 50; j--) {
            System.out.print(j + " ");
        }

        System.out.println();

        // first method
        for (int i = 2; i <= 54; i += 2) {  // value of i is increased by 2
            System.out.print(i + " ");
        }

        System.out.println();

        // second method
        for (int i = 1; i <= 54; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }


        System.out.println("--------------------------------------------------");





    }
}
