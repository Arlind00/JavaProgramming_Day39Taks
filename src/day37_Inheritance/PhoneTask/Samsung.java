package day37_Inheritance.PhoneTask;

public class Samsung extends Phone {    // child class


    public Samsung(String model, double size, double price, String color) {
        super("Samsung", model, size, price, color);
    }


    public void freeze() {
        System.out.println(brand + " just froze...");
    }
}


/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

 */