package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        // && both must be     true    &&    true  = true
        //                     false    &&    true  = false

        System.out.println(name + " is eligible to vote : " + isEligible);


        System.out.println("-------------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 30;
        String state = "UK";
        int income = 4000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && state == "USA" && income >= 60000;
        System.out.println(name2 + " is eligible for loan : " + isEligible2);

        System.out.println("---------------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is eligible for loan : " + isEligible3);


        System.out.println("----------------------------------------------");

        String name4 = "Antonio";
        String countryOfBirth = "USA";
        boolean marriedToUsCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUsCitizen == true;
        //                      true                  or             false
        //                      true + false  = true
        //                      false + false = false

        System.out.println(name4 + " is eligible for Us citizenship : " + isEligible4);

        System.out.println("--------------------------------------------------");

        String student = "Anna";
        double gpa = 3.4;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for schollarship " + isEligible5);


        System.out.println("----------------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
