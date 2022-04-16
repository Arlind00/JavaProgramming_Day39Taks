package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {


        String str = "Cydeo School";

        String brand = str.substring(0, 5);
        System.out.println(brand);


        String str2 = "Java Programming Language";


        String s1 = str2.substring(0, str2.indexOf(" "));   // just JAVA
        String s2 = str2.substring(str2.indexOf(" ") + 1, str2.lastIndexOf(" ") );
        String s3 = str2.substring(str2.lastIndexOf(" ")+1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("------------------------------");

        String str10 = "Java is fun, Java is cool, I love Java";

        String s11 = str10.substring(0,11 ); //Java
        System.out.println("s11 = " + s11);

        String s22 = str10.substring( str10.lastIndexOf(", J")+1, str10.lastIndexOf(","));
        System.out.println("s22 = " + s22);

        String s33 = str10.substring(str10.lastIndexOf("I"));
        System.out.println("s33 = " + s33);

    }
}
