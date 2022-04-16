package day37_Inheritance.scrumTask;

public class Employee extends Person {   // Employee Is A Person

    public String jobTitle;                 // new varialbe just for employee class
    public int id;                          // new varialbe just for employee class
    public double salary;                   // new varialbe just for employee class
    public String companyName;              // new varialbe just for employee class



    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }



    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }

    public String toString() {                  // method override for toString method
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}



/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */