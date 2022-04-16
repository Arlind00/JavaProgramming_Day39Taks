package day21_ForEachLoop;

public class Items_T {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPads", "iPhone 12 case"};   // length 5
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};        // length 5
        int[] itemsIDs = {12345, 12346, 12347, 12348, 12349, 12350};         // length 5


        for (int i = 0; i < items.length; i++) {        // since the lenght of 3 arrays is the same, we can use 1 for loop
            String item = items[i];
            double price = prices[i];
            int id = itemsIDs[i];

            System.out.println(item + " - " + id + " - " + price);
        }
    }
}

/*
    itemName - itemId - price
 */