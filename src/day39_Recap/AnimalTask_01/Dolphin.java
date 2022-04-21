package day39_Recap.AnimalTask_01;

public class Dolphin extends FriendlyAnimals{



    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, true, true, true);
    }



    public void swim(){
        System.out.println(" Dolphins swim");
    }

}
