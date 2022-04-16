package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {


        String[] words = {"Layan", "Layan", "Olga", "Adam", "Olga", "Adam", "Ahmed", "Mustafa", "Adam", "Olga"};


        for (String each : words) {         // each: "Layan", "Layan", "Olga", "Adam", "Olga", "Adam", "Ahmed", "Mustafa", "Adam", "Olga"
            int count = 0;

            for (String element : words) {  // element: "Layan", "Layan", "Olga", "Adam", "Olga", "Adam", "Ahmed", "Mustafa", "Adam", "Olga"
                if (element.equals(each)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }
        }


    }
}
