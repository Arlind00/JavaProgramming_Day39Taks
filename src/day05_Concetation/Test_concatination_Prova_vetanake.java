package day05_Concetation;

public class Test_concatination_Prova_vetanake {

    public static void main(String[] args) {


        String name = "James King";
        int buildingNumber = 14235;
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipcode = "314WA";

        // first method
        System.out.println("first method...");
        System.out.println("zipcode = \t\t" + zipcode + "\nname    =\t\t" + name + "\nbuildingnumber =" + buildingNumber
                + "\nstreet name =   " + streetName + "\ncity = \t\t\t" + city + "\nstate = \t\t" + state);

        // second method
        System.out.println("\nsecond method...");
        System.out.println(zipcode + "\n" + name + "\n" + buildingNumber + "\n" + streetName + "\n" + city + "\n" + state + "\n");

        //third method
        System.out.println("third mehtod...");
        String shippingAddress = zipcode + "\n" + name + "\n" + buildingNumber + "\n" + streetName + "\n" + city + "\n" + state + "\n";
        System.out.println(shippingAddress);

        // you can attach multiple variables to a single variable for simplicity purposes
        String zip = zipcode;
        System.out.println("zip = " + zip);
    }
}
