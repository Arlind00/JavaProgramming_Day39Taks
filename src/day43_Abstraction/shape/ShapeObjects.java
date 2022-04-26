package day43_Abstraction.shape;

public class ShapeObjects {

    public static void main(String[] args) {


        Circle circle1 = new Circle(5);
        Square square1 = new Square(5);
        Rectangle rectangle1 = new Rectangle(5,6);

        System.out.println("rectangle = " + rectangle1);
        System.out.println("square1 = " + square1);
        System.out.println("circle1 = " + circle1);
        System.out.println();


        rectangle1.setLength(10);
        circle1.setRadius(10);
        square1.setWidth(10);

        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("square1 = " + square1);
        System.out.println("circle1 = " + circle1);


    }
}
