package day34_GarbageCollection_AccessModifiers;

import day34_GarbageCollection_AccessModifiers.AccessModifiers.*;

public class AccessModifiers_Test {



    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicData);             // visible to ALL
        System.out.println(AccessModifiers.defaultData);            // visible to package and below
        //  System.out.println(AccessModifiers.privateData  );      // visible only to same class

       AccessModifiers.method1();
       AccessModifiers.method2();
       //AccessModifiers.method3();   // only visible withing its own class



    }
}
