package day51_Map;

import jdk.swing.interop.SwingInterOpUtils;

public class TestEnum {

    public static void main(String[] args) {


        // String browser = "Wooden spoon";
        Browser browser = Browser.EDGE;             // enum that we created
       // Browser browser = Browser.CHROME;
       // Browser browser = Browser.FIREFOX;
       // Browser browser = Browser.OPERA;

        switch (browser) {
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case EDGE:
                System.out.println("EDGE is selected");
                break;

            case CHROME:
                System.out.println("CHROME is selected");
                break;

            case SAFARI:
                System.out.println("SAFARI is selected");
                break;

            default:
                System.out.println("OPERA is selected");
        }

        System.out.println("--------------------------------------------");


        Season season =Season.FALL;                 // only 4 possibilities since we created the enum





    }
}