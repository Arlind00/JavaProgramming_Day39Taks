package day39_Recap.AnimalTask_01;

public class Cat extends FriendlyAnimals {



    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, false, true, true);
    }



    public void meow(){
        System.out.println(" Cats meow ");
    }

}
