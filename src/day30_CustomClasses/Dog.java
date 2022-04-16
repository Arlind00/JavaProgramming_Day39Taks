package day30_CustomClasses;

public class Dog {

    public String name;             // instant variables (each object has separate copy)
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    // method with more than one field options
    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color =dogColor;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    public String toString() {          // we generate toString() because when we call print statement in main it gives us these options
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


/*
    Attributes:  name, age, gender, breed, size, color
    Actions:     eat(), play(), bark() ....
 */