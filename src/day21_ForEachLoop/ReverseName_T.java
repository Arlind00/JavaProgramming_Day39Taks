package day21_ForEachLoop;

public class ReverseName_T {

    public static void main(String[] args) {



        String[] names = {"Harry Potter", "Alastor Mudy", "Albus Dumbledore", "Minerva McGonigall", "Rubeus Hagrid",
                "Gandalf Grey", "Sam Gamgie", "Tomb Raider", "Saruman Wise", "Fatos Nano"};


        for (String each : names) {         //each: "Harry Potter", "Alastor Mudy", "Albus Dumbledore", "Minerva McGonigall"....

            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {      // reverses the content of "each" and assigns to variable reversed
                reversed += each.charAt(i);

            }
            System.out.println(reversed);
        }
    }
}
