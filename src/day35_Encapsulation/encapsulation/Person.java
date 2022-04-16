package day35_Encapsulation.encapsulation;

public class Person {


    private String name;
    private int age;



    public String getName() {                   // getter, enables access to data
        return name;
    }

    public void setName(String name) {          // setter, manipulates data (new data given as argument), (no need for return)
        this.name = name;
    }




    public int getAge() {                        // getter
        return age;
    }

    public void setAge(int age) {                // setter, gives conditions (gives us control over data that can be input)
        if (age <= 0 || age > 150) {
            System.err.println("Invalid Age: " + age);
            System.exit(0);
        }

        this.age = age;
    }
}
