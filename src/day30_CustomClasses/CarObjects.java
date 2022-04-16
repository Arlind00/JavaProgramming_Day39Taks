package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setInfo("Volvo", "cx90", "white", 2018, 2000);
        System.out.println(car1);
        System.out.println();

        Car car2 = new Car();
        System.out.println(car2);

        car2.setInfo("Suzuki", "Swift", "Grey", 2020, 15000);
        System.out.println(car2);
        System.out.println();


        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2017, 35000);
        System.out.println(car3);


      //      Car[] cars = {car1, car2, car3};

        ArrayList<Car> carsList = new ArrayList<>();            // declare an ArrayList
        carsList.addAll(Arrays.asList(car1,car2,car3));         // convert multiple arrays to Collection type then add to arraylist

        for (Car each : carsList) {
            System.out.println(each.brand + " : " + each.price + " $");
        }


        System.out.println("--------------------------------------------");


         carsList.removeIf(p-> p.brand.toUpperCase().equals("BMW") && p.year >= 2005 && p.year <= 2008);
         carsList.removeIf(p-> p.brand.toUpperCase().equals("TOYOTA") && p.year >= 1995 && p.year <= 1997);
         System.out.println(carsList);


    }
}
