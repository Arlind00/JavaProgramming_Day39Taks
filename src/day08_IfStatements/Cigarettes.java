package day08_IfStatements;

public class Cigarettes {

    public static void main(String[] args) {

        byte age = 24;

        if( age < 18){
            System.out.println("age " + age + " is to young to buy cigarettes");
        }else{
            System.out.println("age " + age + " is old enough to buy cigarettes");
        }

    }
}
