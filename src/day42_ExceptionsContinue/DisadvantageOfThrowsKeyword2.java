package day42_ExceptionsContinue;

public class DisadvantageOfThrowsKeyword2 {



    public static void main(String[] args) throws InterruptedException {



        method3();


        String str = null;
        try {
            System.out.println(str.charAt(0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }


    public static void method(){
        try {
            method4();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }       // Method calls method 1

    public static void method1() throws InterruptedException {

        //new FileInputStream("");
        Thread.sleep(3000);
    }           // Method one: delay 3 sec.

    public static void method2() throws InterruptedException {

        method1();
    }           // Method two calls method one

    public static void method3() throws  InterruptedException {

        method2();
        Thread.sleep(3000);
    }          // Method three calls method two + extra 3 sec

    public static void method4() throws InterruptedException {
        method3();
    }           // Method four calls method three



}
