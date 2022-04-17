package day38_Inheritance.Shapes;

public class Square extends Shapes {


    public double side;


    public Square(double side) {
        super("SQUARE");
        this.side = side;
    }


    public double area() {
        return (side * side);
    }


    public double perimeter() {
        return (4 * side);
    }


    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side= " + side +
                ", Area= " + area() +
                ", Perimeter= " + perimeter() +
                '}';
    }
}



/*
Square
	s

	toString(): name, s, area, perimeter

 */