package day43_Abstraction.shape;

public abstract class Shapes {

    private String name;


    public Shapes(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            throw new RuntimeException ("Please enter a valid name...");
        }
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();


    public String toString() {
        return "Shapes {" +
                "name= " + name  +
                '}';
    }

}

/*
Shape task:

	Shape:
		name

		Encapsulate the fields

		Add constructor to set the fields

		area()
		perimeter()
		toString(): name, area, perimeter


	Create the following subclasses of Shape and add the aditional features that are needed:

				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)

				Square:
					area(): s * s
					perimeter: 4 * s

				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi

 */