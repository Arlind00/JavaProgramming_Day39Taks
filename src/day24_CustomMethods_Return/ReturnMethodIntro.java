package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {


        String str = "ava";

        String result = reverse(str);

        System.out.println(result);

        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome ");
        }else {
            System.out.println(str + " is not palindrome ");
        }


    }


    public static String reverse(String str) {       // instead of void we select return type of info that method should return
                                                     // it becomes mandatory to return a value
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;                              // in order to return the value
    }


}
