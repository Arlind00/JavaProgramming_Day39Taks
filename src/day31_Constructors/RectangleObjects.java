package day31_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle(25, 15);
        Rectangle rectangle2 = new Rectangle(5, 10);


        double area1 = rectangle1.calcArea();
        double area2 = rectangle2.calcArea();

        double perimeter1 = rectangle1.calcPerimeter();
        double perimeter2 = rectangle2.calcPerimeter();



        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
