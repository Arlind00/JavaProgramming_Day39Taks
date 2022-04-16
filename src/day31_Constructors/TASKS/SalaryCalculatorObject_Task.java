package day31_Constructors.TASKS;

import day31_Constructors.TASKS.Salary;

public class SalaryCalculatorObject_Task {

    public static void main(String[] args) {


        Salary salary1 = new Salary(7, 40, 0.12, 0.66);

        System.out.println(salary1.hourlyRate);
        System.out.println(salary1.weeklyHours);
        System.out.println(salary1.stateTaxRate);
        System.out.println(salary1.federalTaxRate);
        System.out.println(salary1.salaryAfterTax());

        System.out.println();

        Salary salary2 = new Salary(14, 40, 0.14, 0.50);
        System.out.println(salary2.hourlyRate);
        System.out.println(salary2.weeklyHours);
        System.out.println(salary2.stateTaxRate);
        System.out.println(salary2.federalTaxRate);
        System.out.println(salary2.salaryAfterTax());

    }
}
