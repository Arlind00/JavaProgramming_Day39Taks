package day39_Recap;

public class Square extends Shape {


    private double side;        // for more control over variable



    public double getSide() {
        return side;
    }       // getter

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }
        this.side = side;
    }        // setter


    public Square(double side) {
        super("Square");
        setSide(side);          // we call setter to set the side ( requirements to be checked)
    }


    public double area() {
        return (side * side);
    }       // overwritten


    public double perimeter() {
        return (side * 4);
    }     // overwritten


    public String toString() {
        return " Square {" +
                " side= " + side +
                ", area= " + area()  +
                ", perimeter= " + perimeter()  +
                '}';
    }                       // overwritten


}

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */

