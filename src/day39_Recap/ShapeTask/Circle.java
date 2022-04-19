package day39_Recap.ShapeTask;

public class Circle extends Shape {


    private  double r;
    public static  double pi = 3.14;


    public double getR() {
        return r;
    }

    public void setR(double r) {
        if( r <= 0){
            System.err.println("Enter a valid number");
            System.exit(1);
        }
        this.r = r;
    }



    public Circle( double r) {
        super("Circle");
        setR(r);
    }



    public double area(){
        return (pi * r * r);
    }

    public double perimeter(){
        return (2 * pi * r);
    }

    public String toString() {
        return " Circle {" +
                " radius= " + r +
                " pi= " + pi +
                " area= " + area() +
                " perimeter= " + perimeter() +
                '}';
    }
}



/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */