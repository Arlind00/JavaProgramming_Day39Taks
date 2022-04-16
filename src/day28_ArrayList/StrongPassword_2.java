package day28_ArrayList;

public class StrongPassword_2 {

    public static void main(String[] args) {


        String password = "Oligarchus1991--";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialCharacters = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecialCharacters++;
            }
        }

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpecialCharacters > 0;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasSpecialChar && hasDigit && hasLowerCase && hasUpperCase;
        System.out.println("strongPassword = " + strongPassword);

    }
}
