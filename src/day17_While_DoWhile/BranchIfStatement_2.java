package day17_While_DoWhile;

public class BranchIfStatement_2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.print(i + " ");      // A B
        }

        System.out.println();
        System.out.println("---------------------");


        for (int i = 0; i <= 10; i++) {

            if (!(i % 2 == 0)) {        // if condition is met: continue statement is executed (skips that i value)
                continue;               // 0 2 4 6 8
            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------");


        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {       // if condition is met: continue statement is executed (skips that i value)
                continue;           // 1 3 5 7 9
            }
                System.out.print(i + " ");

        }
    }

}

