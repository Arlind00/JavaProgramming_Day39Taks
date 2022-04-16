package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p -> p < 90);                            // removes grades that are not A
        System.out.println("gradeOfA = " + gradeOfA);


        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p -> !(p >= 80 && p <= 89));            // removes grades that are not B
        System.out.println("gradeOfB = " + gradeOfB);


        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p -> !(p >= 70 && p <= 79));            // removes grades that are not C
        System.out.println("gradeOfC = " + gradeOfC);


        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p -> !(p >= 60 && p <= 69));            // removes grades that are not C
        System.out.println("gradeOfD = " + gradeOfD);


        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.retainAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);
        System.out.println();

        System.out.println("Total number of A: " + gradeOfA.size());
        System.out.println("Total number of B: " + gradeOfB.size());
        System.out.println("Total number of C: " + gradeOfC.size());
        System.out.println("Total number of D: " + gradeOfD.size());
        System.out.println("Total number of F: " + gradeOfF.size());

    }
}
