package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator_T {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        float hourlyRate = scan.nextFloat();
        scan.nextLine();

        System.out.println("How many hours do you work in a week: ");
        int weeklyHours = scan.nextInt();
        scan.nextLine();
        float salary =(float) (hourlyRate * weeklyHours * 4);

        System.out.println("Enter state tax in percentage : ");
        float tax = scan.nextFloat();
        scan.nextLine();
        float stateTax =(float) (tax*salary);

        System.out.println("Enter federal tax in percentage : ");
        float tax2 = scan.nextFloat();
        scan.nextLine();
        float federalTax = tax2*salary;
        scan.close();

        System.out.println("Your salary is: " + salary);
        System.out.println("Your state tax is: " + stateTax);
        System.out.println("Your state tax is: " + federalTax);
        System.out.println("Your total tax is: " + (federalTax+stateTax));
        System.out.println("Your net income is: " + (salary-(federalTax+stateTax)));


    }
}

/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */