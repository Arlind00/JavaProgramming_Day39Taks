package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        //>,<=
        boolean result = 200 > 40;
        System.out.println("result = " + result);   // if result is true it says true, if not false is printed

        boolean result2 = 300 >= 150; //true
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; //true
        System.out.println("result3 = " + result3);

        boolean result4 = 100 <= 50;  //false
        System.out.println("result4 = " + result4);

        System.out.println("---------------------------------");

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore > +720;  // is credit score is 720 or greater, then its eligible for the loan
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120; //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; //false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("-------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x == y; // false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; // false
        System.out.println("result8 = " + result8);

        boolean reslut9 = 'A' == 'a'; // false
        System.out.println("reslut9 = " + reslut9);

        boolean result10 = "Java" == "Java"; // true
        System.out.println("result10 = " + result10);
        
        System.out.println("---------------------------------------");

        boolean result11 =  100 != 100.0; //true
        System.out.println("result11 = " + result11);
        
        boolean result12 = "Java" != "Break"; // true
        System.out.println("result12 = " + result12);




    }
}
