package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------");

        int j = 0;
        while (j < 11) {

            System.out.println(j);
            j++;                // iteration should be given after the statement, otherwise it will not be executed precisely
        }                       // thas why we use the for loop for specific number of loops


        System.out.println("------------------------------------------");

        int k = 0;

        do {
            System.out.println(k);
            k++;
        } while (k < 11);

    }
}
