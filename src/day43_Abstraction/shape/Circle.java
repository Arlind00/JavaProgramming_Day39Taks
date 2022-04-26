package day43_Abstraction.shape;

public final class Circle extends Shapes {


    private double radius;
    private static double pi = 3.14;


    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }




    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new RuntimeException("Invalid value");
        }
        this.radius = radius;
    }


    public double area() {
        return (radius * radius * pi);
    }

    public double perimeter() {
        return (2 * radius * pi);
    }


    public String toString() {
        return "Circle {" +
                "radius= " + radius +
                "area= " + area() +
                "perimeter= " + perimeter() +
                '}';
    }

}


/*
Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi

 */