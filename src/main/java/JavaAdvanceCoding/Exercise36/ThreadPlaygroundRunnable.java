package JavaAdvanceCoding.Exercise36;

public class ThreadPlaygroundRunnable implements Runnable{
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Current thread name : " + Thread.currentThread().getName() + " name: " + name + " " + i);
        }
    }
}
