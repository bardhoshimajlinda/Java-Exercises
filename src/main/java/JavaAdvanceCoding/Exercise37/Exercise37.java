package JavaAdvanceCoding.Exercise37;

import JavaAdvanceCoding.Exercise36.ThreadPlaygroundRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* Create a class containing the standard static method main and a variable of type Executor and using the
factory method newFixedThreadPool of the Executors class to create a pool of 2 executors.
In iteration, add 10 ThreadPlaygroundRunnable objects from the previous task to the executor. Use any
string and current iteration number as the name. */
public class Exercise37 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i=0; i<10; i++) {
            String threadName = "Thread-" + i;
            ThreadPlaygroundRunnable runnable = new ThreadPlaygroundRunnable(threadName);
            executorService.submit(runnable);
        }
        executorService.shutdown();
    }
}
