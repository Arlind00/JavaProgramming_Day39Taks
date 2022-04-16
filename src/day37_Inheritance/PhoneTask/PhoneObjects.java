package day37_Inheritance.PhoneTask;

public class PhoneObjects {


    public static void main(String[] args) {


        Iphone iphone1 = new Iphone("x12", 6.2, 1200, "Grey");
        System.out.println(iphone1);
        System.out.println(iphone1.brand);
        System.out.println(iphone1.price);
        iphone1.faceTime(56445646);
        System.out.println();

        Iphone iphone2 = new Iphone("GS3", 4.0, 600, "White-black");
        System.out.println(iphone2);
        System.out.println(iphone2.brand);
        System.out.println(iphone2.price);
        iphone2.faceTime("kingOfNiggeria@hotmail.com");

        System.out.println("============================================");


        Samsung samsung1 = new Samsung("Galaxy 4", 6.2, 800, "Metallic");
        System.out.println(samsung1);
        System.out.println(samsung1.brand);
        System.out.println(samsung1.price);
        samsung1.freeze();
        System.out.println();

        Samsung samsung2 = new Samsung("Note 3", 6.3, 1100, "Millenium Grey ");
        System.out.println(samsung2);
        System.out.println(samsung2.brand);
        System.out.println(samsung2.price);
        System.out.println();

        System.out.println("============================================");


        Nokia nokia1 = new Nokia("Luna", 4.8, 350, "Boring blue");
        System.out.println(nokia1);
        System.out.println(nokia1.brand);
        System.out.println(nokia1.price);
        nokia1.selfDefense();
        System.out.println();

        Nokia nokia2 = new Nokia("Windows", 5.0, 700, "Micro White");
        System.out.println(nokia2);
        System.out.println(nokia2.brand);
        System.out.println(nokia2.price);
    }
}


/*
1.5 Create a class named Phone Objects and test of the sub class' objects
 */