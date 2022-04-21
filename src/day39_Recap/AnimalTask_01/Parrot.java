package day39_Recap.AnimalTask_01;

public class Parrot extends FriendlyAnimals {


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, false, true, false);
    }



    public void fly(){
        System.out.println("Parrots fly");
    }

    public void sing(){
        System.out.println("Parrots can sing");
    }


}
