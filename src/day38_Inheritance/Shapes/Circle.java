package day38_Inheritance.Shapes;

public class Circle extends Shapes {

    public double r;
    public double pi = 3.14;


    public Circle(double r) {
        super("CIRCLE");
        this.r = r;
        pi = 3.14;
    }


    public double area() {
        return (pi * r * r);
    }

    public double perimeter() {
        return (2 * pi * r);
    }


    public String toString() {
        return "Circle { " +
                " name= " + name + ", " +
                " radius= " + r +
                ", pi= " + pi +
                ", Area= " + area() +
                ", Perimeter= " + perimeter() +
                '}';
    }
}

/*
Circle
	r
	pi

	toString(): name, r, pi, area, perimeter
 */