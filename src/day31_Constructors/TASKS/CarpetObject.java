package day31_Constructors.TASKS;

public class CarpetObject {

    public static void main(String[] args) {
        
        Carpet carpet1 = new Carpet(2.5, 2.5,50, false );
        System.out.println(carpet1);

        System.out.println("Unit price: $" + carpet1.unitPrice);
        System.out.println("is Persian: " + carpet1.isPersian);
        System.out.println("Total Price: $" + carpet1.calcCost());



    }
}
