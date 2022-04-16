package day17_While_DoWhile;

public class Challenge_T {

    public static void main(String[] args) {


        int rowCount = 5;
        for (int row = 1; row <= rowCount; row++) {

            int value = row;
            for (int col = 1; col <= row ; col++) {
                System.out.print(value + " ");
                value += rowCount - col;            //adding 4 for coul =1, adding 3 when col=2
            }
            System.out.println();
        }

    }
}


/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */