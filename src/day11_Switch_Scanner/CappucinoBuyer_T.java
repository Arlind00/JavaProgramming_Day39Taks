package day11_Switch_Scanner;

public class CappucinoBuyer_T {

    public static void main(String[] args) {

        /* first method
        String size = "tall";
        boolean validate = size == "tall" || size == "venti" || size == "grande";

        String details = "";

        if (validate) {

            if (size == "tall") {
                details = "tall : \n\t\t price is $3.69 \n\t\t 90 calories";
            } else if (size == "grande") {
                details = "grande : \n\t\t price is $3.99 \n\t\t 120 calories";
            } else {
                details = "venti : \n\t\t price is $4.29 \n\t\t 150 calories";
            }
        } else {
            details = "Invalid size";
        }
        System.out.println("details = " + details);
*/

        /* second method
        char size = 'm';
        String details = "";

        switch (size) {

            case 't':
                details = "tall: \n\t\t price is $3.69 \n\t\t 90 calories";
                break;

            case 'g':
                details = "grande: \n\t\t price is $3.99 \n\t\t 120 calories";
                break;

            case 'v':
                details = "venti: \n\t\t price is $4.29 \n\t\t 150 calories";
                break;

            default:
                details = "Incorrect input";
        }
        System.out.println("details = " + details);
*/

        // third method
        String size = "tall";
        String details = "";

        if (size == "tall" || size == "grande" || size == "venti") {

            switch (size) {
                case "tall":
                    details = " tall: \n\t\t\t\t price is $3.69 \n\t\t\t\t 90 calories";
                    break;
                case "grande":
                    details = " grande: \n\t\t\t\tprice is $3.99 \n\t\t\t\t 120 calories";
                    break;
                case "venti":
                    details = " venti: \n\t\t\t\t price is $4.29 \n\t\t\t\t 150 calories";
                    break;
            }
        } else {
            details = "Invalid input!!!";
        }
        System.out.println("details = " + details);

    }
}

/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:
						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"
			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed



 */