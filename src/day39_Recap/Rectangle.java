package day39_Recap;

public class Rectangle extends Shape {


    private double length, width;


    public double getLength() {
        return length;
    }       // getter

    public void setLength(double length) {
        if(length <= 0){
            System.err.println("Invalid Length: "+length);
            System.exit(1);
        }
        this.length = length;
    }         // setter


    public double getWidth() {
        return width;
    }         // getter

    public void setWidth(double width) {
        if(width <= 0){
            System.err.println("Invalid Width: "+width);
            System.exit(1);
        }
        this.width = width;
    }           // setter



    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }



    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * ( length + width);
    }


    public String toString() {
        return " Rectangle {" +
                " length= " + length +
                ", width= " + width +
                ", area= " + area()  +
                ", perimeter= " + perimeter()   +
                '}';
    }




}

/*
Rectangle extends Shape:
	variables:
		length
		width
	Encapsulate the fields
	Add a constructor to set the filed
	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */
