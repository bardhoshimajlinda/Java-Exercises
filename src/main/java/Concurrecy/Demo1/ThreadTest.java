package Concurrecy.Demo1;

import Concurrecy.Demo1.MyRunnable;

public class ThreadTest {
    public static void main(String[] args) {
         MyRunnable runnable = new MyRunnable();
         Thread thread = new Thread(runnable);

         thread.start();

        System.out.println("back in main");
    }
}

