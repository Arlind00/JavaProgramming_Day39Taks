package day39_Recap.CydeoTask;

public class Developer extends Employee {



    public Developer(String name, int age, char gender, int employeeId , double salary) {
        super(name, age, gender, employeeId, "DEVELOPER", salary);
    }



    public void work(){
        System.out.println( "Employee which works as Developer Name:" + getName() + " and employee ID: " + getEmployeeId());
    }

    public void fixingBugs(){
        System.out.println("Developers fix bugs found by TESTERS");
    }
}



/*
4. Create a subclass of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */