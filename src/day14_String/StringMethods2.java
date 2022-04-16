package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, i Love learning Java";
        String str2 = str.replace("Java", "Python");  // new string object


        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email2 = " + email);
        
        String str3 = "Python Python Cydeo Cydeo Python Python Cydeo Python";
        String str4 = str3.replace("Python", "") .replace("  ", "");
        System.out.println("str4 = " + str4);

        String dog = "dog dog dog dog dog dog";
        String cat = dog.replace("dog", "cat");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);

        String str5 = "Java is cool, Java is fun";
        str5 = str5.replace("is", "IS");
        String str6 = str5.replaceFirst("Java", "Python");
        System.out.println("str6 = " + str6);




    }
}
