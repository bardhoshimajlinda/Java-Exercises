package JavaAdvanceCoding.Exercise16;
//Create an enum Runner class with constants BEGINNER, INTERMEDIATE, ADVANCED. Enum should have two
//parameters:
//• minimum time of running a marathon in minutes
//• maximum running time of the marathon in minutes
//In addition, the Runner enum should contain the static getFitnessLevel() method, which takes any time
//result of a marathon run, and as a result should return a specific Runner object based on the given time.
public class Exercise16 {
    public static void main(String[] args) {
        int marathonTime = 80;
        Runner fitnessLevel = Runner.getFitnessLevel(marathonTime);

        if (fitnessLevel != null) {
            System.out.println("Fitness Level: " + fitnessLevel);
        } else {
            System.out.println("No fitness level found for the given time.");
        }
    }
}
