package day39_Recap.AnimalTask_01;

public class Eagle extends WildAnimals{



    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, true, false, false);
    }



    public void   hunt(){
        System.out.println( getName() +  " is a wild animal usually are used for hunting, not so much to hunted");
    }
}
