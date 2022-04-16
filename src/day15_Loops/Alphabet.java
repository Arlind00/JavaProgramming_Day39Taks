package day15_Loops;

public class Alphabet {

    public static void main(String[] args) {

        // first method
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");    // i is representing from (65 to 90) is converted to char variable in order char to be printed
        }
        System.out.println();


        // second method
        for (char i = 'A'; i <= 'Z'; i++) {     //
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 90; i >= 65; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();


        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------------------");


        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + "  ");
        }
        System.out.println();
        System.out.println();

        for (int i = 122; i >= 97; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();



        // prints 40000 characters from the intelliJ char range
      /*  for (char i = 1; i <= 40000; i++) {
            System.out.print(i + " ");
        }
*/
    }
}
