package day18_NestedLoop;

public class test {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= 10; i++) {

            // inner loop to print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}




