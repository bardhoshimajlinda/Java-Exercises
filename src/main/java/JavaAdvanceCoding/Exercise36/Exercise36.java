package JavaAdvanceCoding.Exercise36;
/* Create a ThreadPlaygroundRunnable class that implements the Runnable interface having a name field of
type String with a public constructor for that field. The class should implement the run() method from the
Runnable interface. This method should contain a loop iterating up to 10 and print the name of the current
thread using Thread.currentThread().getName(), the name given in the constructor and the current iteration
number.
Create a class that has two private static Thread fields and a standard public static void main (String []
args) method. Then initialize the Thread fields using the constructor that accepts the Runnable object and
pass ThreadPlaygroundRunnable creating it using the constructor, each time giving a different name.
On each thread (Thread) use the start() method.*/
public class Exercise36 {
    private static Thread thread1;
    private static Thread thread2;
    public static void main(String[] args) {
        thread1 = new Thread(new ThreadPlaygroundRunnable("test1"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("test2"));

        thread1.start();
        thread2.start();
    }
}
