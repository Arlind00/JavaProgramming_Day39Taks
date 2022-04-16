package day32_Constructor;

public class ConstructorCalls {



    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }


    public ConstructorCalls(int a){
        this();         // Default Constructor
        System.out.println("Constructor with int argument");
    }


    public ConstructorCalls(String str){
        this(10);       //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }

}
