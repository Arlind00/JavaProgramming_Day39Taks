package day16_ForLoopStringPractice;

public class DigitsLettersSpcialChar {

    public static void main(String[] args) {

        String str = "Cydeo13245School! @#$%WoodenSpoon";

        String digits = "";          //12345
        String letters = "";         //CydeoWoodenSpoon
        String specialChars = "";    //!@#$%


        for (int i = 0; i < str.length(); i++) {     // index numbers of str (0 to last)

            char ch = str.charAt(i);                 // every character of String str

            if (ch > '0' && ch < '9') {              // if the character is between 0 and 0
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {     // if the character is between A and Z
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {     // if the character is between a and z
                letters += ch;
            } else {
                if (ch != ' '){                      // if special character is not a space
                specialChars += ch;                  // if the character is neither digit nor letter
            }
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
