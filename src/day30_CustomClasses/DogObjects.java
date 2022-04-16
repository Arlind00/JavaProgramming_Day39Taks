package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();       // declaring an object
        dog1.name = "Lucy";         // fields of object
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.gender = 'f';
        dog1.size = "small";
        dog1.color = "white";

        Dog dog2 = new Dog();
        dog2.name = "Lessy";
        dog2.breed = "Malamute";
        dog2.age = 3;
        dog2.gender = 'm';
        dog2.size = "medium";
        dog2.color = "mix";

        Dog dog3 = new Dog();
        dog3.setInfo("Putin", "German shepard" , 2, 'm', "large", "blue");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();


        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        dog4.setInfo("Murki", "Vuqak", 5,'M',"big", "brownish");
        dog5.setInfo("Maxi", "putlice", 3, 'f',"ultra small", "white");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        int freqM = 0;
        int freqF = 0;
        for (Dog each : dogs) {
            if(each.gender == 'M' || each.gender == 'm'){
                maleDogs.add(each);
                freqM++;
            }else {
                femaleDogs.add(each);
                freqF++;
            }
        }
        System.out.println("freqM = " + freqM);
        System.out.println(maleDogs);
        System.out.println("freqF = " + freqF);
        System.out.println(femaleDogs);
        
    }
}
