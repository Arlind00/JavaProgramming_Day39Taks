package day30_CustomClasses;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Sadam", 'm', 23, 22642, 'A');

        Student student2 = new Student();
        student2.setInfo("Bush", 'm', 48, 22643, 'F');

        Student student3 = new Student();
        student3.setInfo("Clinton", 'f', 80, 22644, 'D');

        Student student4 = new Student();
        student4.setInfo("Blair", 'm', 99, 22645, 'C');

        Student student5 = new Student();
        student5.setInfo("Kurti", 'm', 22, 22646, 'B');


        Student[] students = {student1, student2, student3, student4, student5};

        for (Student each : students) {
            System.out.println(each);
        }


        System.out.println("-------------------------------");


        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {          // adds students with grade A into earlyBirds, everyone else at angryBirds
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);
    }
}
