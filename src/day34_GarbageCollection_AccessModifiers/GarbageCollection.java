package day34_GarbageCollection_AccessModifiers;


import day30_CustomClasses.Dog;
import day32_Constructor.Car;
import day33_Statics.Iphone;
import day33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {


    public static void main(String[] args) {



        String str = "Wooden Spoon";
        System.out.println(str);

        str = null;
        System.out.println("unreferenced:  " + str);          //  unreferenced, eligible for garbage collection




        Car car1 = new Car("Toyota");
        System.out.println(car1);

        car1 = null;                                          //  unreferenced, eligible for garbage collection
        System.out.println(car1);




        System.out.println("--------------------------------------");




        Dog dog1 = new Dog();                   // first object
        dog1.name = "Lucy";
        System.out.println(dog1);

        dog1 = new Dog();                      // reassigning object one
        dog1.name = "Maxx";                    // unreferenced
        System.out.println(dog1);




        System.out.println("--------------------------------------");




        String language = "Python";             // unreferenced, eligible for garbage collection
        language    =   "Java";

        System.out.println(language);




        System.out.println("--------------------------------------");




        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;                      // list1 and list 2 share same elements ( 2 variables reference one object)

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );                    // they are same object, shared by 2 variables



/*
        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);      // one object created
        student1.grade = 'A';

        Student student2 = student1;            //  we assigned first obj to second object
        student2.name = "Ahmet";

        System.out.println(student1);           // same output
        System.out.println(student2);           // same output
 */

    }
}
