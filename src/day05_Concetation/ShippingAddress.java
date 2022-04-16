package day05_Concetation;

public class ShippingAddress {

    public static void main(String[] args) {


        //Multiple variables with same data type
        String name = "James King",
                buildingNumber = "14235",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "314WA";

        //
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + ", " + zipCode);



        // second method: all the

        String shippingAdress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + ", " + zipCode;
        System.out.println("\nsecond methotd:\n");
        System.out.println("shippingAdress = " + shippingAdress);


    }
}


/*
Declare the following variables name = "",
                                buidlingNumber = " ",
                                streetName = "   ",
                                city = " ",
                                state = " ",
                                zipCode = " ";


 */