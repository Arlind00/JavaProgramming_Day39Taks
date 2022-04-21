package day39_Recap.AnimalTask_01;

public class Animal {

    private String name, breed;
    private char gender;
    private int age;
    private String size;
    private String color;



    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name entry ... ");
            System.exit(1);
        }
        this.name = name;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed == null || breed.isBlank() || breed.isEmpty()){
            System.err.println("Invalid breed entry ... ");
            System.exit(1);
        }
        this.breed = breed;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !( gender == 'M' || gender == 'F' ))
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.err.println("Invalid age entered...");
            System.exit(1);
        }
        this.age = age;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank() || color.isEmpty()){
            System.err.println("Invalid name entry ... ");
            System.exit(1);
        }
        this.color = color;
    }



    public void eat(){
        System.out.println("Animal is eating");
    }

    public void drink(){
        System.out.println("Animal is drinking");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void move(){
        System.out.println("Animal si moving");
    }


    public String toString() {
        return " Animal {" +
                " name= " + name  +
                ", breed= " + breed  +
                ", gender= " + gender +
                ", age= " + age +
                ", size= " + size  +
                ", color= " + color  +
                '}';
    }

}



/*
1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()
 */
