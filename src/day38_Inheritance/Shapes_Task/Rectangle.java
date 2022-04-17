package day38_Inheritance.Shapes_Task;

public class Rectangle extends Shapes{


    public double length;
    public double width;



    public Rectangle( double length, double width) {
        super("RECTANGLE");
        this.length = length;
        this.width = width;
    }



    public double area() {
        return (width * length) ;
    }


    public double perimeter() {
        return (2 * (length + width)) ;
    }


    public String toString() {
        return "Rectangle{ " +
                " name= " + name + '\'' +
                ", length= " + length +
                ", width=" + width +
                ", Area= " + area()+
                ", Perimeter= " + perimeter() +
                '}';
    }
}


/*
Rectangle
	l
	w

	toString(): name, l, w, area, perimeter
 */