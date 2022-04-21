package day39_Recap.AnimalTask_01;

public class Python extends WildAnimals{



    public Python(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, true, false, false);
    }


    public void   hunt(){
        System.out.println( getName() +  " is a wild animal hunted for valuable skin");
    }
}
