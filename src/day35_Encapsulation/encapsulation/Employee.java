package day35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }


    public char getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }


    public double getSalary() {
        return salary;
    }







    public void setName(String name) {
        if (name.isBlank()) {
            System.err.println(" Please write a name...");
            return;
        }
        this.name = name;
    }


    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'm' || gender == 'f' || gender == 'F')) {
            System.err.println("Typo... you entered imaginary gender");
            return;
        }
        this.gender = gender;
    }


    public void setAge(int age) {
        if (age < 16 || age > 90) {
            System.err.println("Age you entered is Not within boundary limits...");
            return;
        }
        this.age =  age;
    }


    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Salary cant be negative, Dumbo...");
            return;
        }
        this.salary = salary;
    }


    public String toString() {
        return "Empoyee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
