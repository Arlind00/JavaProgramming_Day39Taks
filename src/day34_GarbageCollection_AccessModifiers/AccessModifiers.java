package day34_GarbageCollection_AccessModifiers;

import javax.xml.crypto.Data;

public class AccessModifiers {


    public static int publicData = 100;             // public modifier  (variable type)
    static int defaultData = 200;                   // default (no access modifier) (variable type)
    private static int privateData = 300;           // private modifier  (variable type)


    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }






}
