package day46_47_Polymorphism;

import day44_Abstraction.Animal.Animal;
import day44_Abstraction.Animal.Cat;
import day44_Abstraction.Animal.Dog;
import day44_Abstraction.Animal.Playable;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class Intro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4), new Square(5)};   // object is parent of all types of variables



        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal.drink();
        animal.eat();
        // animal.play();
        //  animal.bark();


        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink();
        //  animal2.eat();


        Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");

        Shape shape = new Circle(5);
        shape.area();

        //  System.out.println( shape.getRadius());
        // System.out.println( shape.PI);

        boolean isSquare = shape instanceof Square;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isCircle = " + isCircle);






    }
}
/*
           WebDriver driver:
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ...
         */