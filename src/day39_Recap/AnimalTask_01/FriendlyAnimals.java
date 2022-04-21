package day39_Recap.AnimalTask_01;


public class FriendlyAnimals extends Animal{



    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;



    public FriendlyAnimals(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
        this.isFriendly = isFriendly;

    }



    public void play(){
        System.out.println(" Friendly Animal is playing");
    }

    private void pet(){
        System.out.println("Friendly animal is being pet");
    }


    public String toString() {
        return "FriendlyAnimals {" +
                " isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}



/*
2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */