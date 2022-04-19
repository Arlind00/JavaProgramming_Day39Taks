package day39_Recap.CydeoTask;

public class Person {



    private String name;
    private int age;
    private char gender;



    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.isBlank() || name.isEmpty() ){
            System.err.println(" Invalid parameter entered!! ");
            System.exit(1);
        }
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age <= 18 || age >= 65){
            System.err.println(" Invalid age entered!!! ");
            System.exit(1);
        }
        this.age = age;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') ){
            System.err.println(" Invalid gender entered!!! ");
            System.exit(1);
        }
        this.gender = gender;
    }



    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name= " + name   +
                ", age= " + age +
                ", gender= " + gender +
                '}';
    }


}



/*
 1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */