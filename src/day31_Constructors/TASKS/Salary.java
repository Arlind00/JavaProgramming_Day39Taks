package day31_Constructors.TASKS;

public class Salary {

    public double hourlyRate;
    public double weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;



    public Salary(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(double hourlyRate, double weeklyHours) {
        return  (hourlyRate * weeklyHours);
    }

    public double stateTax(){
        return ((hourlyRate * weeklyHours) * stateTaxRate);
    }

    public double federalTax(){
        return (((hourlyRate * weeklyHours) * federalTaxRate));
    }

    public double salaryAfterTax(){
        return (hourlyRate * weeklyHours) - (((hourlyRate * weeklyHours) * stateTaxRate) + ((hourlyRate * weeklyHours) * federalTaxRate));
    }

    public String toString() {
        return "SalaryCalculator_Task{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", state tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", Salary after tax= $" + salaryAfterTax() +
                '}';
    }
}
/*

1.1 Create a class named Salary calculator:
        Attributes:
        hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

        Add a constructor to set all the fields

        Actions:
        salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
        stateTax(): calculates the totalStateTax
        federalTax(): calculates the total federal tax
        salaryAfterTax(): calculates the salary after tax
        toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */