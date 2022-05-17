package day45_Abstraction.Shape;


public class Cube extends Shape {


    private double edge;


    public Cube(String name, double edge) {
        super("Cube");
        setEdge(edge);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {

        if (edge <= 0) {
            throw new RuntimeException("Invalid value: " + edge);
        }
        this.edge = edge;
    }

    public double area() {
        return (6 * edge * edge);
    }

    public double perimeter() {
        return (12 * edge);
    }


    public String toString() {
        return " Cube {" +
                super.toString() +
                " edge= " + edge +
                '}';
    }
}
