package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name); //this.name = name;     // in order to call CONSTRUCTOR in another CONSTRUCTOR
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);                 // in order to call CONSTRUCTOR in another CONSTRUCTOR
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);       // in order to call CONSTRUCTOR in another CONSTRUCTOR
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
