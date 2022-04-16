package day35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {



        Circle circle1 = new Circle(1.7);

        System.out.println(circle1);
        System.out.println(circle1.calcPerimeter());
        System.out.println(circle1.calcArea());

        Circle circle2 = circle1;
        System.out.println("circle2 = " + circle2);


        circle1.setRadius(25);
        System.out.println("circle2 = " + circle2);

        circle2.setRadius(20);
        System.out.println("circle1 = " + circle1);

    }
}
