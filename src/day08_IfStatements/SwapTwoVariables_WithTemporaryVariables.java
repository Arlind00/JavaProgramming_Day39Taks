package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        // first way with temporary varialbe
        int c = b; // c = 15
        b = a;     // b = 10
        a = c;     // a = 15

        System.out.println("a = " + a); //15
        System.out.println("b = " + b); //10



        System.out.println("----------------");

        //second way without temporary variable
        int x = 10;
        int y = 15;

        System.out.println("y value before swap : " + y);
        System.out.println("x value before swap : " + x);

        y = y + x; // y = 25
        x = y - x; // x = 15

        System.out.println("y value after swap : " + y);
        System.out.println("x value after swap : " + x);

    }
}

/*


 */