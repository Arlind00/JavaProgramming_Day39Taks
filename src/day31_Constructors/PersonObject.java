package day31_Constructors;

public class PersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Daniel", 'm', 25);        // we dont need set info method
        Person person2 = new Person("Cormier", 'm', 37);


        System.out.println(person1);
        System.out.println(person2);

        person2.age = 33;
        System.out.println(person2);
    }
}
