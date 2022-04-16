package day35_Encapsulation.encapsulation;

public class PersonObject {


    public static void main(String[] args) {



        Person p1 = new Person();
        // p1.name = "Daniel";          // private data
        // p1.age = 28;                 // private data


        p1.setName("Daniel");           // setter
        p1.setAge(45);                  // setter


        // System.out.println(p1.name +" : "+p1.age);       // private data
        System.out.println(p1.getName() + " : " + p1.getAge());

    }
}
