package JavaAdvanceCoding.Exercise23;
/*
Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your
animals:
int getNumberOfAllAnimals() → returns the number of all animals
Map <String, Integer> getAnimalsCount() → returns the number of animals of each species
Map <String, Integer> getAnimalsCountSorted() → returns the number of animals of each species
sorted based on the number of animals of a given species, where the first element is always the species with the largest number of animals
void addAnimals(String, int) → adds n animals of a given species
 */
public class Exercise23 {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        myZoo.addAnimals("Lion", 3);
        myZoo.addAnimals("Elephant", 5);
        myZoo.addAnimals("Monkey", 10);
        myZoo.addAnimals("Lion", 2);
        myZoo.addAnimals("Elephant", 2);

        System.out.println("Total number of animals: " + myZoo.getNumberOfAllAnimals());
        System.out.println("Animals count: " + myZoo.getAnimalsCount());
        System.out.println("Animals count (sorted): " + myZoo.getAnimalsCountSorted());

    }
}
