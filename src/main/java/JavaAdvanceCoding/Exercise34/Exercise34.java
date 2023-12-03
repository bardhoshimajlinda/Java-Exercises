package JavaAdvanceCoding.Exercise34;
/*
Create a class that extends the Thread class, e.g. MyThread, overload the run() method so it displays the
thread name in the console by reading it from the static method of the current thread:
Thread.currentThread().getName()
Create a class with the public static void main (String [] args) method. Inside the main method create a
type variable of our class created above, e.g. MyThread and initialize the class. Perform the start() method
on the variable.
 */
public class Exercise34 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
