package day40_FinalKeyword;

public class ProtectedAccessModifier {


    static String name1 = "Cydeo";                    // default access modifier
    protected static String name2 = "Wooden Spoon";   // protected is visible outside package in subclass


    static void method1() {
    }                         // not accessible outside the package

    protected static void method2() {
    }               // accessible outside package in subclass


}
