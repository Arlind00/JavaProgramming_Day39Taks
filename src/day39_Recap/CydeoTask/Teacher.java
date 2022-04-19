package day39_Recap.CydeoTask;

public class Teacher extends Employee {


    public Teacher(String name, int age, char gender, int employeeId , double salary) {
        super(name, age, gender, employeeId, "TEACHER" , salary);
    }

    public void work(){
        System.out.println( "Employee which works as TEACHER, with Name:" + getName() + " and employee ID: " + getEmployeeId());
    }
}


/*
5. Create a subclass of Employee named Teacher

            Override the work method

 */