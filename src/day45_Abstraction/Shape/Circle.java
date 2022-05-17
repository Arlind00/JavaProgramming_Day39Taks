package day45_Abstraction.Shape;

public class Circle extends Shape {


    private double radius;

    public final static double pi = 3.1428 ;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if(radius<0){
            throw new RuntimeException("Invalid value" + radius );
        }
        this.radius = radius;
    }



    public double area() {
        return (radius * radius * pi);
    }

    public double perimeter() {
        return (2 * radius * pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                "radius=" + radius +
                '}';
    }
}


