package day39_Recap.CydeoTask;

public class CydeoObject {


    public static void main(String[] args) {





        Tester tester1 = new Tester("Luigi", 44, 'm', 001, 53000);
        Developer developer1 = new Developer("Kingi", 44, 'm', 002, 55000);
        Teacher teacher1 = new Teacher("Einstein", 63, 'm', 003, 65000);
        Student student1 = new Student("SkyWalker", 35, 'm', 004, "Jedi, but not master");


        System.out.println("student1 = " + student1);
        System.out.println("teacher1 = " + teacher1);
        System.out.println("developer1 = " + developer1);
        System.out.println("tester1 = " + tester1);
        System.out.println();

        student1.study();
        student1.setFieldOfStudy("Astro-Physics");
        student1.setStudentId(666);
        student1.setName("Bryan Jones");
        System.out.println("student1 = " + student1);
        System.out.println();

        tester1.createTicket();
        tester1.work();
        tester1.setAge(25);
        tester1.setGender('f');
        tester1.setSalary(66000);
        System.out.println("tester1 = " + tester1);
        System.out.println();

        developer1.fixingBugs();
        developer1.work();
        developer1.setName("Bill gates");
        System.out.println("developer1 = " + developer1);
        System.out.println();


        teacher1.work();
        teacher1.setName("isac newton");
        teacher1.setAge(64);
        System.out.println(teacher1.getAge());





    }
}


/*
 7. Create a class named Cydeo:
        create objects of Tester, Developer,Teacher, Student

        test all the functions of each objects

        Analyze the relationships between the classes

 */