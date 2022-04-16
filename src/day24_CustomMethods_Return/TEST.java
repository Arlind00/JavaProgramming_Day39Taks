package day24_CustomMethods_Return;

public class TEST {

    public static void main(String[] args) {


        String str = "aaaaaaaaaasdddddddddv";

        str = ReturnMethodsPractice_4.removeDuplicates(str);        // we specify where is the specific method in order to pull and execute it
        System.out.println(str);

        String name = "Java Programming";

        String reverseName = ReturnMethodIntro.reverse(name);
        System.out.println(reverseName);
    }
}
