package day30_CustomClasses;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int iD;
    public char grade;


    public void setInfo(String name, char gender, int age, int iD, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.iD = iD;
        this.grade = grade;
    }       // easy way to enter attributes of object

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", iD=" + iD +
                ", grade=" + grade +
                '}';
    }       // to be able to print in main

    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }



}
