package utilities;

public class Timer {

    public static void sleep(double seconds){       // custom method that we created

        try {
            Thread.sleep( (long)(seconds * 1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
