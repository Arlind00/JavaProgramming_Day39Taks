package day13_StringClass;

import java.util.Scanner;

public class CardGame_Group26 {

    public static void main(String[] args) {

        System.out.println("Enter your card number:  ");

        Scanner scan = new Scanner(System.in);
        int numberOfCard = scan.nextInt();
        scan.nextLine();
        scan.close();

        int teamNumber = numberOfCard / 13;
        int cardNumber = numberOfCard % 13;

        String teamName = "";
        String cardName = "";

        if (teamNumber == 0) {
            teamName = "Clubs";
        } else if (teamNumber == 1) {
            teamName = "Diamonds";
        } else if (teamNumber == 2) {
            teamName = "Hearts";
        } else {
            teamName = "Spades";
        }

// CARD NAMES --->>> (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,Jack, Queen, King)
        switch (cardNumber) {

            case 1:
                cardName = "Ace";
                break;
            case 2:
                cardName = "2";
                break;
            case 3:
                cardName = "3";
                break;
            case 4:
                cardName = "4";
                break;
            case 5:
                cardName = "5";
                break;
            case 6:
                cardName = "6";
                break;
            case 7:
                cardName = "7";
                break;
            case 8:
                cardName = "8";
                break;
            case 9:
                cardName = "9";
                break;
            case 10:
                cardName = "10";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            default:
                cardName = "King";

        }
        System.out.println("your card is " + cardName + " of " + teamName);
// The card you picked is Jack of Hearts

    }
}


