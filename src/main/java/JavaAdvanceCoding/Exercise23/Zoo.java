package JavaAdvanceCoding.Exercise23;

import java.util.*;

public class Zoo {
    private Map<String, Integer> animals;

    public Zoo() {
        this.animals = new HashMap<>();
    }

    public int getNumberOfAllAnimals() {
        int totalAnimals = 0;
        for (int count : animals.values()) {
            totalAnimals += count;
        }
        return totalAnimals;
    }

    public Map<String, Integer> getAnimalsCount() {
        return new HashMap<>(animals);
    }
    public Map<String, Integer> getAnimalsCountSorted() {
        Map<String, Integer> sortedAnimals = new LinkedHashMap<>();

        animals.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sortedAnimals.put(entry.getKey(), entry.getValue()));

        return sortedAnimals;
    }

    public void addAnimals(String species, int count) {
        animals.put(species, animals.getOrDefault(species, 0) + count);
    }
}
