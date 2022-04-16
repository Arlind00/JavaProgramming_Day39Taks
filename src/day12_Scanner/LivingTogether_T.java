package day12_Scanner;

import java.util.Scanner;

public class LivingTogether_T {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("With how many people do you live with ?");
        int people = scan.nextInt();
        String write = "";
        scan.nextLine();
        scan.close();

        if(people < 3 && people >= 0){
            write = "Live with less than 3 people";

        }else if(people >= 3 && people <= 6){
            write = "Live with \"3 - 6 people";

        }else {
            write = "Live with  more 6 people";
        }

        System.out.println("write = " + write);

    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people" */
