package day09_IfStatements;

public class EligibleForAlcohol {

    public static void main(String[] args) {

        int age = 20;

        if( age >= 18 ){
            System.out.println("Age " + age + " is eligible tu buy alcohol.");
        }else{
            System.out.println("Age " + age + " is NOT eligible to buy alcohol.");
        }

    }

}
