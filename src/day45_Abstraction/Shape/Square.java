package day45_Abstraction.Shape;

public class Square extends Shape {


    private double side;


    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if (side <= 0){
            throw new RuntimeException("Invalid vaule: " + side);
        }
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
                super.toString() +
                " side= " + side +
                '}';
    }
}
