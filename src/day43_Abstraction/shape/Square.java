package day43_Abstraction.shape;

public final class Square extends Shapes{

        private double width;


    public Square( double width) {
        super("Square");
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new RuntimeException("Invalid value");
        }
        this.width = width;
    }

    public double area() {
        return (width * width);
    }

    public double perimeter() {
        return (width * 4);
    }

    public String toString() {
        return "Square {" +
                "width= " + width +
                "perimeter= " + perimeter() +
                "area= " + area() +
                '}';
    }
}


/*
Square:
        area(): s * s
        perimeter: 4 * s
 */