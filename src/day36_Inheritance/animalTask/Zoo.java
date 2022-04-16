package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "small", "white");

        dog.eat();                  // common method (Animal)
        dog.drink();                // common method (Animal)
        dog.sleep();                // common method (Animal)
        dog.move();                 // common method (Animal)
        dog.bark();                 // common method (Animal)
        // dog.hunt();              // method of Cat
        // dog.scratch();           // method of Cat

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");

        cat.eat();                  // common method (Animal)
        cat.sleep();                // common method (Animal)
        cat.drink();                // common method (Animal)
        cat.move();                 // common method (Animal)
        //  cat.bark();             // method of Dog
        //  cat.hunt();             // method of Dog
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        tiger.eat();            // common method (Animal)
        tiger.sleep();          // common method (Animal)
        tiger.drink();          // common method (Animal)
        tiger.move();           // common method (Animal)

        tiger.roar();           // method of Tiger
        tiger.hunt();           // method of Tiger

        System.out.println(tiger);

        //  tiger.bark();       // method of Dog







    }


}
