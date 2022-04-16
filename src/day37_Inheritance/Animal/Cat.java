package day37_Inheritance.Animal;

public class Cat extends Animal {


    public boolean catHurrls;            // extra variable for Cat class

    public Cat(String name, String breed, char gender, int age, String size, String color, String catHurrls) {
        super(name, breed, gender, age, size, color);
        this.catHurrls = true;     // extra variable
    }



    public void scratch() {
        System.out.println(name + " is scratching");
    }


}
