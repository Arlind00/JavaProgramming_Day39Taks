package day32_Constructor;

public class EmployeeObjects {


    public static void main(String[] args) {


        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1);

        Employee employee2 = new Employee("Musa", 'm');
        System.out.println(employee2);

        Employee employee3 = new Employee("Emel", 'f',"SDET");
        System.out.println(employee3);

        Employee employee4 = new Employee("Stalin", 'm', "dictator", 10000);
        System.out.println(employee4);

    }
}
