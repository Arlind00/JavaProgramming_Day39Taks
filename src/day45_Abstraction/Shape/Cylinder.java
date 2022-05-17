package day45_Abstraction.Shape;

public class Cylinder extends Shape implements Volume  {


    private double h;
    private double r;
    private final double pi = 3.14;


    public Cylinder(double h, double r) {
        super("Cylinder");
        setH(h);
        setR(r);
    }



    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h <= 0){
            throw new RuntimeException("Invalid value: " + h);
        }
        this.h = h;
    }


    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r <= 0){
            throw new RuntimeException("Invalid value: " + r);
        }
        this.r = r;
    }

    public double getPi() {
        return pi;
    }




    public double area() {
        return ((2 * pi * r * h) + (2 * pi * r * r));
    }

    public double perimeter() {
        return ( 2 * pi * r);
    }

    public double volume() {
        return (pi * pi * r * h ) ;
    }


    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "h=" + h +
                ", r=" + r +
                ", pi=" + pi +
                '}';
    }
}
