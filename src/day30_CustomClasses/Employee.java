package day30_CustomClasses;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int iD;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public void setInfo(String name, char gender, int age, int iD, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.iD = iD;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }       // allows to print


    public void work(){
        System.out.println(jobTitle + " " + name + " is working");
    }
}
