package Concurrecy.Demo1;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        go();
    }

    private void go() {
        doMore();
    }

    private void doMore() {
        System.out.println("top o’ the stack");
    }
}
