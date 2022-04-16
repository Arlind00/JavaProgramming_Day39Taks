package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;
        while(a){
            System.out.println("ihaa - while loop");
        }

        System.out.println("---------------------------------");

        do {
            System.out.println("ihaa - do while loop");
        }while (a);                 // if condition is true, the statement is repeated again, if condition is not true than it stops


        System.out.println("---------------------------------");

        for(int i = 0; a;){
            System.out.println("ihaa - for loop");
        }

    }
}
