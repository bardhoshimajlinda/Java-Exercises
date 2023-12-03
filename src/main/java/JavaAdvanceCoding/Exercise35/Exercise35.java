package JavaAdvanceCoding.Exercise35;
/*Create a class implementing Runnable, e.g. MyRunnable. Implement the run() method, which will display
the name of the current thread in the same way as in the previous exercise.
Create a class with the public static void main (String [] args) method. Inside the main method, create a
class type variable created above, e.g. MyRunnable, and initialize the class.
Create a Thread variable and initialize it by passing the Runnable interface implementation as the
constructor parameter. Perform the start() method on a Thread type variable */
public class Exercise35 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        thread.start();

    }
}
