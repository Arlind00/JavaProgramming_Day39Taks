package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n =100;

        if( n%2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("Odd");
        }

        System.out.println("-----------------------------");

        String result1 = ( n%2 == 0)? "even" : "odd";   // ternaries for
        System.out.println("result1 = " + result1);

        System.out.println("-----------------------------");

        int age = 23;

        /*
        if( age >= 21){
            System.out.println("eligible");     // string
        }else{
            System.out.println("not eligible"); // string
        }

        */
        String result2 = ( age >= 21 )? "eligible" : "not eligible";
                         //           ?==>if       :==> else
        System.out.println("result2 = " + result2);


        System.out.println("-----------------------------");

        int number = 100;
/*
        if(number>0){
            System.out.println("positive");
        }else if(number<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }

*/
      String result3 = (number>0)? "positive" :(number<0)? "negative" : "zero";
        System.out.println("result3 = " + result3);
    }
}
