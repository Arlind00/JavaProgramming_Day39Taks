package day37_Inheritance.PhoneTask;

public class Iphone extends Phone {         // child class


    public Iphone(String model, double size, double price, String color) {
        super("Apple", model, size, price, color);
    }


    public void faceTime(long phoneNumber) {
        System.out.println(brand + " is face timing: " + phoneNumber);
    }

    public void faceTime(String email) {             // method overload
        System.out.println(brand + " is e-mailing: " + email);
    }


}

/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					constructor()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */