package day39_Recap.AnimalTask_01;

public class ZooObject {


    public static void main(String[] args) {

        Crocodile crocodile1 = new Crocodile("Croki","Nile",'M',30,"Huge","Greenish");
        Dog dog1 = new Dog("Lessy", "Retriever", 'F',5,"Medium","Colorfull");
        Cat cat1 = new Cat("Zico", "Indian", 'M', 3,"Medium", "Black");
        Parrot parrot1 = new Parrot("Ace", "Nymph", 'M',70,"small", "red");
        Bear bear1 = new Bear("Yogi", "Greezly", 'M', 15,"Huge","Brown");
        Eagle eagle1 = new Eagle("Shkype", "Native", 'M', 6,"Big", "MIX");
        Tiger tiger1 = new Tiger("Shirkhan", "Benghal", 'M', 20,"Big", "Yellow with stripes");
        Python python1 = new Python("Snek", "Python",'F', 30,"Loooong", "mix" );
        Lion lion1 = new Lion("Simba", "King", 'M', 7, "big", "Yellowish");
        Dolphin dolphin1 = new Dolphin("Fliper", "Beluga", 'F', 9, "Medium", "Greyish");


        System.out.println("dolphin1 = " + dolphin1);
        System.out.println("lion1 = " + lion1);
        System.out.println("python1 = " + python1);
        System.out.println("tiger1 = " + tiger1);
        System.out.println("eagle1 = " + eagle1);
        System.out.println("bear1 = " + bear1);
        System.out.println("parrot1 = " + parrot1);
        System.out.println("cat1 = " + cat1);
        System.out.println("crocodile1 = " + crocodile1);
        System.out.println("dog1 = " + dog1);
        System.out.println();

        dolphin1.swim();
        dolphin1.eat();
        dolphin1.getName();
        System.out.println();




    }
}



