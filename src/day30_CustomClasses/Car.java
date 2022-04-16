package day30_CustomClasses;

public class Car {

    public String brand;        // instant variables (each object has separate copy)
    public String model;
    public String color;
    public int year;
    public double price;


    // set info method with more than one attribute
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand = carBrand;       // data given at argument we assign to according instant variable
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }


    // to be able to print
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }


    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }


    public void start(){
        System.out.println(brand + " " + model + " has started");
    }


    public void stop(){
        System.out.println(brand + " " + model + " has stopped");
    }
}
