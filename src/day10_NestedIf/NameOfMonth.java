package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        int num = 13;
        String name = "";

        if( num >=1 && num <= 12){

        if (num == 1) {
            name = "January";
        } else if (num == 2) {
            name = "February";
        } else if (num == 3) {
            name = "March";
        } else if (num == 4) {
            name = "April";
        } else if (num == 5) {
            name = "May";
        } else if (num == 6) {
            name = "June";
        } else if (num == 7) {
            name = "July";
        } else if (num == 6) {
            name = "June";
        } else if (num == 7) {
            name = "July";
        } else if (num == 8){
            name = "August";
        } else if (num == 9){
            name = "September";
        } else if (num == 10){
            name = "October";
        } else if (num == 11){
            name = "November";
        } else  {
            name = "December";
        }
        System.out.println("name = " + name);
    }else{
            System.out.println("Invalid number entry");
        }
    }
}
