package day31_Constructors.TASKS;

public class Address {


    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public int zipCode;


    public Address(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " "+ state + " "  + zipCode;
    }
}
/*
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */