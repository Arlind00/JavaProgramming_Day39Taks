package day40_FinalKeyword;

public class Dog extends Animal{



    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }       // constructor


    public void eat(){
        System.out.println(getName()+" is eating dog food");
    }           // overridden method


    /*
    public void drink(){                                                // final methods can not be overridden because
        System.out.println(getName()+" is drinking beer");
    }
     */

    public void bark(){
        System.out.println(getName()+" is barking");


    }

}
