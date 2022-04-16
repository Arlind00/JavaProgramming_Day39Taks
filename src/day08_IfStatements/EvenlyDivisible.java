package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int num = 65;

        boolean div2 = num % 2 == 0;
        boolean div3 = num % 3 == 0;
        boolean div5 = num % 5 == 0;

        System.out.println(num + " is divisible by 2 " + div2);
        System.out.println(num + " is divisible by 3 " + div3);
        System.out.println(num + " is divisible by 2 " + div5);

        System.out.println("----------------------");

        //my own method (not elegant way)

        int num2 = 65;
        int divi2 = num2 % 2;
        int divi3 = num2 % 3;
        int divi5 = num2 % 5;

        boolean test1 = divi2 ==0;
        boolean test2 = divi3 ==0;
        boolean test3 = divi5 ==0;

        System.out.println("test1 = " + test1);
        System.out.println("test2 = " + test2);
        System.out.println("test3 = " + test3);


        System.out.println("-------------------------");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;
        System.out.println(year + " is LeapYear : " + isLeapYear);
    }
}


/*
2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

 */