package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {


        String str = "123";                   // for converting String to PRIMITIVE type we ise parse method

        // primitive = primitive
        int num = Integer.parseInt(str);      // returns int value, its neither unbox nor autobox
        System.out.println(num +1);           // 124
        System.out.println(str+1);            // 1231
        System.out.println();


        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);      // return type is double primitive
        System.out.println(num2 +1);                 // 11.5
        System.out.println(str2+1);                  // 10.51
        System.out.println();


        int max = Integer.MAX_VALUE;             // returns max value int that can be assigned in JAVA
        int min = Integer.MIN_VALUE;             // returns min value int that can be assigned in JAVA

        System.out.println("max =  " + max);
        System.out.println("min = " + min);
        System.out.println();

        long max2 = Long.MAX_VALUE;             // returns max value long that can be assigned in JAVA
        long min2 = Long.MIN_VALUE;             // returns min value long that can be assigned in JAVA
        System.out.println("max =  " + max2);
        System.out.println("min = " + min2);
        System.out.println();

        String s1 = "true";
        boolean b1= Boolean.parseBoolean(s1);               // with parse method we can convert String into primitive Boolean, returns boolean
        System.out.println(b1);                             // anything else except true in string, will give false
        System.out.println();


        String s2 = "mama";
        boolean b2= Boolean.parseBoolean(s2);               // with parse method we can convert String into primitive Boolean, returns boolean
        System.out.println(b2);                             // anything else except true in string, will give false
        System.out.println();




        String s3 = "123";
        Integer x = Integer.valueOf(s3);            // we convert string to Wrapper Integer, returns Integer
        System.out.println(x);
        System.out.println();

        int y = Integer.valueOf(s3);                // we convert from Wrapper Integer,to primitive int
        System.out.println(y);
        System.out.println();

        y= x;
        System.out.println(y+1);
        System.out.println();


        String s4 = "1.5";
        Double z = Double.valueOf(s4);          // convert String to Wrapper double, no unboxing or autoboxing, its assigning Wrapper to Wrapper
        System.out.println(z);
        System.out.println();

        double z2 = Double.valueOf(s4);         // converts String to Wrapper double, unboxing is done since its assigned to int primitive
        System.out.println(z2);

        System.out.println("---------------------------------");

         char ch1 = 'A';

         boolean r1 = Character.isDigit(ch1);     // checks if the character is digit, returns boolean
         System.out.println(r1);

         boolean r2 = Character.isLetter(ch1);    // checks if the character is letter, returns boolean
         System.out.println(r2);

         boolean r3 = !Character.isLetterOrDigit(ch1);  // checks if character is special Char, returns boolean
         System.out.println(r3);

         boolean r4 = Character.isUpperCase(ch1);       // checks if character is upperCase, returns boolean
         System.out.println(r4);

         boolean r5 = Character.isUpperCase(ch1);       // checks if character is loweCase, returns boolean
         System.out.println(r5);


        System.out.println("-------------------------------");


        String str1 = "15sdf1s6d51fsdfv6sd15fv69s48d1f6vc";         // add sum of digits

        int sum =0;

        for (char each : str1.toCharArray()) {             // we get each character from String

            if(Character.isDigit(each)){
                sum +=   Integer.parseInt(""+ each);           //  we convet char numbers, to integer numbers in order to be able to make addition
            }
        }
        System.out.println(sum);







    }
}
