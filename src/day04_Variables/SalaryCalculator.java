package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        //hourly Rate, weeklyHours

        int hourslyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        int salary = hourslyRate * weeklyHours * 52;

        // System.out.println(salary); in order to print a variable
        System.out.println("hourlyRate = $" + hourslyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("");
        System.out.println("salary = $" + salary);
    }
}
