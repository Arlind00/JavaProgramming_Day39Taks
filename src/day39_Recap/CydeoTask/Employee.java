package day39_Recap.CydeoTask;

public class Employee extends Person  {




    private int employeeId;
    private String jobTitle;
    private double salary;




    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if( employeeId <= 0 ){
            System.err.println(" Invalid ID no. !!! ");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println(" Invalid job title entry !!!");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary <=0 ){
            System.err.println(" Invalid salary entry!!!");
            System.exit(1);
        }
        this.salary = salary;
    }



    public void work(){
       System.out.println( "Employee with ID no:" + employeeId + "works as " + jobTitle);
   }

    public String toString() {
        return " Employee {" +
                " employeeId= " + employeeId +
                ", jobTitle= " + jobTitle  +
                ", salary= " + salary +
                '}';
    }
}



/*
Create a subclass of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */