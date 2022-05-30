package day46_47_Polymorphism;

import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Person;
import day43_Abstraction.employee.Tester;
import day44_Abstraction.Animal.Animal;
import day44_Abstraction.Animal.Cat;
import day44_Abstraction.Animal.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //   Shape shape = (Shape) new Circle(4); //upcasting is done automatically  (object type is child of parent class)

        Shape shape2 = new Circle(5);

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //   Dog dog = (Dog)animal; // downcasting form
        //  dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark();       // downcasting without assigning a variable (one time usable)


        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide()  );


        System.out.println("---------------------------------------------------");


        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        // Cat cat = (Cat) animal2;
        // cat.meow();

        ((Cat) animal2 ).meow();
        // ( (Dog) animal2 ).bark();


        System.out.println("---------------------------------------------------");



        Employee employee = new Tester("Ali",30,'M',42,145000.00);

        ( (Tester)employee ).bugReport();

        //  ( (Tester)employee ).unitTest();     // does not have unitTest method
        //  ( (Developer)employee ).unitTest();  // does have unitTest method

        //  Driver driver = (Driver) employee;      // line 1 no, IS A relationship between tester and driver
        Person person = (Person) employee;          // line 2 yes, IS A relationship between person and driver
        //    Teacher teacher = (Teacher) employee; // line 3 no, IS A relationship between teacher and driver

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();  // class exception circle can't be converted to cube, there is no, IS A relationship


    }
}
