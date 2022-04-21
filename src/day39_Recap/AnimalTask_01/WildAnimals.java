package day39_Recap.AnimalTask_01;

public class WildAnimals extends Animal {


    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;



    public WildAnimals(String name, String breed, char gender, int age, String size, String color,boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
        this.isFriendly = isFriendly;
    }


    public void   hunt(){
        System.out.println(" Wild animals are hunted for sport nowadays");
    }


    public String toString() {
        return " WildAnimals {" +
                " isWild=" + isWild +
                ", isFriendly= " + isFriendly +
                ", isPlayable= " + isPlayable +
                '}';
    }


}

/*
3. Create a subclass of Animal named WildAnimal:
        Variable:
        isWild, isFriendly, isPlayable

        Extra Methods:
        hunt()

 */
