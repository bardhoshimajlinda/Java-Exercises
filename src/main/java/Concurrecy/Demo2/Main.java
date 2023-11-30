package Concurrecy.Demo2;

public class Main {
    public static void main(String[] args) {
        /* A thread of execution in a program(kinda of like a virtual CPU)
        The JVM allows an application to have multiple threads running concurrently.
        Each thread can execute parts of your code in parallel with the mean thread.
        Each thread has a priority.
        Threads with higher priority are executed in preference compared to threads with a lower priority.

        The Java Virtual Machine continues to execute threads until either of the one of the following occurs
           1. The exit method of class Runtime has been called
           2. All user threads have died

          When a JVM starts up, there is a thread which calls the main method
          This thread is called "main."

          Daemon thread is a low priority thread that runs in background to perform task such as garbage collection
           JVM terminates itself when all user threads (non-daemon threads) finish their execution.*/


        // to see how many threads are currently active:
        System.out.println(Thread.activeCount());

        //To get the name of this specific thread:
        System.out.println(Thread.currentThread().getName());

        // we can change the name:
        Thread.currentThread().setName("MAIN");
        System.out.println(Thread.currentThread().getName());

        //Thread priority check
        System.out.println(Thread.currentThread().getPriority());

        //Change the priority
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        // check if the thread is currently alive
        System.out.println(Thread.currentThread().isAlive());

        //You can have a thread sleep

        for (int i = 3; i>0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("You are done!");

        //Create a second thread, by creating a child class of the thread class
        MyThread thread2 = new MyThread();
        System.out.println(thread2.isAlive());
        thread2.start();
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());
        thread2.setName("2nd thread");
        System.out.println(thread2.getName());

        // it is going to inherit the priority of the thread that created it
        thread2.setPriority(1);
        System.out.println(thread2.getPriority());

        //how many threads are currently active
        System.out.println(Thread.activeCount());

        //check if is a daemon thread

        System.out.println(thread2.isDaemon());
        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());


    }
}