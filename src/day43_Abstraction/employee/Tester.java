package day43_Abstraction.employee;

public final class Tester extends Employee {


    public Tester(String name, int age, char gender, int id , double salary) {
        super(name, age, gender, id, "Tester", salary);
    }


    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }

}
