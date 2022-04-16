package day21_ForEachLoop;

public class Initials_T {

    public static void main(String[] args) {

        String[] names = {"Harry Potter", "Alastor Mudy", "Albus Dumbledore", "Minerva McGonigall", "Rubeus Hagrid",
                "Gandalf Grey", "Sam Gamgie", "Tomb Raider", "Saruman Wise", "Fatos Nano"};

        // data type of array  :  array name
        for (String each : names) {
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            // each.charAt(0)  we know the index, we want the character
            // each.indexof(char something)  we know the character, we want the index
            System.out.println(initial);

        }

    }
}
