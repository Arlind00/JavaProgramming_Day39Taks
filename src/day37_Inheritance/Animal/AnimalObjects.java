package day37_Inheritance.Animal;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M', 1, "Small", "White");
        System.out.println(dog1);

        dog1.bark();            // method of dog class
        //dog1.scratch();       // method of different class (not dog class)
        //dog1.sing();          // method of different class (not dog class)



        Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "Large", "Black", "true");
        System.out.println(cat1);

        cat1.scratch();         // method of cat class
        //  cat1.bark();        // method of different class (not cat class)
        //  cat1.sing();        // method of different class (not cat class)



        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Blue");
        System.out.println(parrot1);

        parrot1.sing();         // method of parrot class
        //  parrot1.bark();     // method of different class (not parrot class)
        //  parrot1.scratch();  // method of different class (not parrot class)


    }
}
