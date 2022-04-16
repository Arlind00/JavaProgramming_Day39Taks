package day37_Inheritance.Animal;

public class Dog extends Animal {


    public Dog(String name, String breed, char gender, int age, String size, String color) {             // CONSTRUCTOR for Dog
        super(name, breed, gender, age, size, color);                                                    // mandatory call the parent Constructor
    }


    public void bark() {
        System.out.println(name + " is barking");
    }


}
