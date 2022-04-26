package day43_Abstraction.employee;

public final class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int id,  double salary) {
        super(name, age, gender, id, " Teacher", salary);
    }


    public void work() {
        System.out.println(getName()+" is teaching.");
    }


    public void sleep() {
        System.out.println(getName()+" is slepping 8 hours.");
    }
}
