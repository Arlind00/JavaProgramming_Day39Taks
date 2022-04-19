package day39_Recap;

public class ShapeObject {

    public static void main(String[] args) {



        Square square = new Square(10);
        System.out.println(square);


        square.setSide( 15 );
        System.out.println(square);
        System.out.println(square.getName());


        System.out.println("------------------------");



        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println( rectangle.getLength() );
        System.out.println( rectangle);
        System.out.println(rectangle.getName());


        System.out.println("------------------------");


        Circle circle = new Circle(7.5);
        System.out.println(circle);

        circle.setR(15.5);
        System.out.println( circle.getR() );
        System.out.println(circle);
        System.out.println(circle.getName());














    }
}
