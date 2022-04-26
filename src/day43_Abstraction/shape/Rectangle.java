package day43_Abstraction.shape;

public final class Rectangle extends Shapes {


    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new RuntimeException("Invlid value");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new RuntimeException("Invalid value");
        }
        this.length = length;
    }



    public double area() {
        return (width * length);
    }

    public double perimeter() {
        return (2 * (width + length));
    }


    public String toString() {
        return "Rectangle {" +
                "width=" + width +
                ", length=" + length +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
