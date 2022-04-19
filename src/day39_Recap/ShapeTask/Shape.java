package day39_Recap.ShapeTask;

public class Shape {


    private String name;            // for more control




    public String getName() {
        return name;
    }       // getter because of private specifier

    public void setName(String name) {
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1: some thing went wrong, 0: nothing went wrong
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }         // setter because of private specifier



    public Shape(String name) {
        setName(name);
    }   // constructor


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }



    public String toString() {
        return "Shape{" +
                " name= " + name   +
                ", area= " + area()   +
                ", perimeter= " + perimeter()   +
                '}';
    }


}
/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */
