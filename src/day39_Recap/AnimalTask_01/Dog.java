package day39_Recap.AnimalTask_01;

public class Dog extends FriendlyAnimals {



    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, false, true, true);
    }

    public void bark(){
        System.out.println(" Dogs bark ");
    }
}
