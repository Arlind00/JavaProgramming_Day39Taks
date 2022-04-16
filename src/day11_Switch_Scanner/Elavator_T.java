package day11_Switch_Scanner;

public class Elavator_T {

    public static void main(String[] args) {

        /*
        char floorNum = '0';
        String floorInfo = "";

        if(floorNum == '1' || floorNum == '2' || floorNum == '3'){
            if (floorNum == '1'){
                floorInfo = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            }else if (floorNum == '2'){
                floorInfo = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            }else{
                floorInfo = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else {
            floorInfo = "Invalid floor - 6";
        }
        System.out.println(floorInfo);
*/   // first method

        /*
        char floorNumber = '3';
        String floorInfo = "";

        switch (floorNumber){
            case '1':
                floorInfo = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;

            case '2':
                floorInfo = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;

            case '3':
                floorInfo = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;

            default:
                floorInfo = "Invalid floor - 6";
        }

        System.out.println(floorInfo);
*/   // second method

        char floorNum = '1';
        String floorInfo = "";

        if (floorNum == 1 || floorNum == 2 || floorNum == 3) {

            switch (floorNum) {

                case '1':
                    floorInfo = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case '2':
                    floorInfo = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    floorInfo = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        } else {
            floorInfo = "Invalid floor - 6";
        }

        System.out.println(floorInfo);

    }
}
/*

	2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */