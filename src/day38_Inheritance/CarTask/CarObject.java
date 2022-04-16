package day38_Inheritance.CarTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {


    public static void main(String[] args) {


        Toyota toyota = new Toyota( "Camry", 2020, 25000, "grey", 5000);
        Tesla tesla = new Tesla( "model S", 2019, 35000, "black", 20000);
        BMW bmw = new BMW( "S2", 2008, 15000, "white", 70000);



        System.out.println("car1 = " + toyota);
        System.out.println("car2 = " + tesla);
        System.out.println("car3 = " + bmw);


        toyota.drive();
        toyota.start();
        toyota.reliable();
        System.out.println();

        tesla.drive();
        tesla.start();
        tesla.autoPilot();
        System.out.println();

        bmw.drive();
        bmw.start();
        bmw.breaksDown();
        bmw.racing();
        System.out.println();



    }
}

