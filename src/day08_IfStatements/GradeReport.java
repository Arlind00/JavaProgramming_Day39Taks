package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 77;


        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 90;   // or score >= 80 && !a;
        boolean c = score >= 70 && score <= 79;   // or !a && !b && score >= 70;
        boolean d = score >= 60 && score <= 69;   // or !a && !b && !c && score >= 60;
        boolean f = score >= 0 && score <= 59;   // or !a &7 !b && !c && !d;


        if (a) {
            System.out.println(" excellent");
        }

        if (b) {
            System.out.println(" great");
        }

        if (c) {
            System.out.println(" good");
        }

        if (d) {
            System.out.println(" passed");
        }

        if (f) { // OR if (!a && !b && !c && !d )
            System.out.println(" failed");
        }




        /*
        System.out.println( true == !false ); //true
        System.out.println( !true != false ); //false
        System.out.println( !false == true ); //true

        System.out.println( !!false ); //false
        System.out.println( !!!true ); //false
        */


    }
}

/*
90 ~ 100 ==> excellent
80 ~ 89  ==> great
70 ~ 79  ==> good
60 ~ 69  ==> passed
 0 ~ 59  ==> failed
 */