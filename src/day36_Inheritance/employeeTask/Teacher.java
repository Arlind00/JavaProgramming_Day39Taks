package day36_Inheritance.employeeTask;

public class Teacher extends Employee {


    public static void main(String[] args) {


        Teacher teacher1 = new Teacher();
        teacher1.name = "Newton";
        teacher1.age = 81;
        teacher1.gender = 'm';
        teacher1.id = 981;
        teacher1.salary = 5000;
        teacher1.jobTitle = "Physician";
        teacher1.companyName = "Falling Apple";

        System.out.println(teacher1);
        System.out.println();

        teacher1.work();

        Teacher teacher2 = new Teacher();
        teacher2.name = "Bernouli";
        teacher2.age = 65;
        teacher2.gender = 'm';
        teacher2.id = 66;
        teacher2.salary = 3500;
        teacher2.jobTitle = "Physician";
        teacher2.companyName = "Under pressure";

        System.out.println(teacher2);


    }
}
