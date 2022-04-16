package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment
        int num1 = 100;
        System.out.println("number = " + num1);  //100

        num1 = 200;   // no need for variable name because we are re-assigning a number to variable
        System.out.println("number = " + num1);  //200

        String word = "Java programming";
        System.out.println("word = " + word);    // "Java programming"

        word = "Wooden spoon";
        System.out.println("word = " + word);    // "Wooden spoon"

        System.out.println("-------------------------------");

        //Addition assignment
        int x = 100;
        System.out.println("x = " + x );
        System.out.println(x + 200);      //300
        System.out.println(x);            //100

        x += 200;                         // shortcut for x = x + 200
        System.out.println("x = " + x );  //300

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num2 = 2.5;
        System.out.println("num2 = " + num2);  //2.5

        num2 += 5.5;
        System.out.println("num2 = " + num2);  //8.0
        
        double availableBalance = 1000.5;
        availableBalance += 300;       //1000.5 + 300
        System.out.println("availableBalance = " + availableBalance);   //1300.5

        System.out.println("----------------------------");

        // -= it doesnt work with String variables (only += works with String variables)
        availableBalance -= 500;   // 1300.5 - 500 = 800.5
        System.out.println("availableBalance = " + availableBalance);   //800.5

        availableBalance -= 200;   // 800.5 - 200 = 600.5
        availableBalance += 400;   // 600.5 + 400 = 1000.5
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("----------------------------");

        double salary = 50000.5;
        salary *= 2;
        System.out.println("salary = " + salary);
        
        double doge = 0.0000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);


        System.out.println("----------------------------");

        double num3 = 25000;
        num3 /= 2;  // divide num3 by 2, 25000/2
        System.out.println("num3 = " + num3);


        System.out.println("----------------------------");

        double num4 = 100;
        num4 %= 3;
        System.out.println("num4 = " + num4);

        System.out.println("----------------------------");

        int amount = 127;  //cents
        int quarters = amount / 25;
        int cents = amount %25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("----------------------------");

        int cents2= 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("----------------------------");

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);


        System.out.println("----------------------------");

        int balance = 3500;
        balance %=153;
        System.out.println("balance = " + balance);



    }
}
