package JavaAdvanceCoding.Exercise38;

public class CoffeeMachine {
    private boolean waterTankEmpty;

    public CoffeeMachine() {
        this.waterTankEmpty = true;
    }

    public synchronized void startBrewing() {
        while (waterTankEmpty) {
            try {
                System.out.println("Waiting for water to be refilled...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Brewing coffee...");

        waterTankEmpty = true;
    }

    public synchronized void refillWater() {
        System.out.println("Water tank refilled.");
        waterTankEmpty = false;
        notify();
    }
}
