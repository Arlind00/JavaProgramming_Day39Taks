package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

}


class A {                                        // outer class
    static class B {                             // inner class (can be static class)
        public static void method1() {
        }
    }
}


class C {
    public static void main(String[] args) {
        A.B.method1();                          // in order to access to inner class we should start from outer classes
    }
}




class X {                            // outer class
}


class Y {                            // outer class
}


class Z {                            // outer class
    static class Q {                 // inner class (can be static class)
    }
}