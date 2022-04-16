package day35_Encapsulation.encapsulation;

public class Circle {


    private double radius;
    public static double pi = 3.1415;

    public Circle(double radius) {                                       // constructor
        setRadius((int) radius);
    }

    public double getRadius() {                                          // getter of radius
        return radius;
    }


    public void setRadius(int radius) {                                  // setter of radius(with condition)
        if (radius < 0) {
            System.err.println("Radius cant be negative... ");
            return;
        }
        this.radius = radius;
    }


    public double calcArea() {
        return (pi * radius * radius);
    }


    public double calcPerimeter() {
        return (2 * pi * radius);
    }


    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                ",  Area= " + calcArea() +
                ",  Perimeter= " + calcPerimeter() +
                '}';
    }
}

/*
2. Create a class named Circle

			privtae variable:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()


 */