package day15_Loops;

public class FINRA_T {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {                  // when the number is both divisible by 3 and 5 same as (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + "FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            }else{
                System.out.print(i + " ");
            }
        }


    }
}
