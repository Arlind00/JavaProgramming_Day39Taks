package day39_Recap.CydeoTask;

public class Tester extends Employee {



    public Tester(String name, int age, char gender, int employeeId , double salary) {
        super(name, age, gender, employeeId, " TESTER", salary);
    }



    public void work(){
        System.out.println( "Employee which works as Tester  Name:" + getName() + "salary: " + getSalary());
    }

    public void createTicket(){
        System.out.println("TESTER: " + getName() + " checks software for Bugs and if there are any, creates a ticket for them");
    }


}





/*
3. Create a subclass of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */