package JavaAdvanceCoding.Exercise38;
/* Write an application that will simulate a coffee making machine. In the event that any coffee brewing service
finds an empty water tank, the thread should stop. When the water is refilled in the machine, the thread
should be excited. */
public class Exercise38 {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeBrewingService brewingService = new CoffeeBrewingService(coffeeMachine);


        brewingService.start();


        try {
            System.out.println("Simulating time passing...");
            Thread.sleep(3000);
            coffeeMachine.refillWater();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
