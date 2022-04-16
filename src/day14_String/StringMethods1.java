package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "     batch   25  ";
        str1 = str1.trim();
        System.out.println(str1);

        System.out.println("------------------");

        String str2 = "cydeo school";
        int n1 = str2.indexOf("ch");    // we can make index unique by making it unique in argument
        System.out.println("n1 = " + n1);

        String str3 = "Java Programming language";
        int n2 = str3.indexOf("gu");
        System.out.println("n2 = " + n2);
        int n3 = str3.lastIndexOf("g");


        String s = "Java Nova Cava Wawa orange";
        int firsA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.indexOf("ava W");
        int fourthA1 = s.lastIndexOf("av");
        int fourthA2 = s.indexOf("Ca") + 1;

        System.out.println("firsA = " + firsA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fourthA1 = " + fourthA1);
        System.out.println("fourthA2 = " + fourthA2);








    }
}
