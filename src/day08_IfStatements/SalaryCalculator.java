package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;

        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = stateTaxRate * salaryBeforeTax / 100;
        double federalTax = salaryBeforeTax * federalTaxRate /100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is : $" + salaryBeforeTax );
        System.out.println("State tax = $ " + stateTax);
        System.out.println("Federal tax = $ " + federalTax);
        System.out.println("Total tax = $ " + totalTax);
        System.out.println("Net income is: " + salaryAfterTax);

    }
}

/*
Create a class SalaryCalculator
programm should print/calculate:

Gross pay is : $117000
State tax = $ 7605.0
Federal tax = $ 30654.0
Total tax = $ 38259.0
Net income is: 78741.0

 */