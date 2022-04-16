package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Miki", 'm', 16, 50);
        System.out.println(employee1);

        employee1.setAge(32);               // via setter we can change data of object
        System.out.println(employee1);


        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        System.out.println("Old name = "  + employee2.getName());

        employee2.setName("Elvira");
        System.out.println("new name = "  +  employee2.getName());
        System.out.println(employee2);

        System.out.println("old salary = " +  employee2.getSalary());
        employee2.setSalary(employee2.getSalary() + 15000);             // get the old value of salary, add 15000 to old value
        System.out.println("New salary = " +  employee2.getSalary());

        System.out.println(employee1);
        System.out.println(employee2);





    }
}
