package JavaAdvanceCoding.Exercise38;

public class CoffeeBrewingService extends Thread {
    private CoffeeMachine coffeeMachine;

    public CoffeeBrewingService(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        coffeeMachine.startBrewing();
    }
}
