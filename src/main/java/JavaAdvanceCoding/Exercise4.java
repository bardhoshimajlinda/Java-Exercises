package JavaAdvanceCoding;

import java.util.*;

/*   Create a Storage class that will have a private Map field, a public constructor, and methods:
     addToStorage(String key, String value) → adding elements to the storage
     printValues(String key) → displaying all elements under a given key
     findValues(String value) → displaying all keys that have a given value
     The Storage class should allow you to store multiple values under one key. */
public class Exercise4 {
    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addToStorage("Monday", "Java");
        storage.addToStorage("Tuesday", "Python");
        storage.addToStorage("Tuesday", "C#");
        storage.addToStorage("Wednesday", "C#");

        storage.printValues("Tuesday");
        storage.findValues("C#");

    }
}
class Storage {
    private Map<String,List<String>> map;

    public Storage() {
        map =  new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public void printValues(String key) {
        List<String> values = map.get(key);
        if (values != null) {
            System.out.println("Values under key '" + key + "': " + values);
        } else {
            System.out.println("No values found for key '" + key + "'.");
        }
    }

    public void findValues(String value) {
        List<String> keysWithGivenValue = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(value)) {
                keysWithGivenValue.add(entry.getKey());
            }
        }

        if (!keysWithGivenValue.isEmpty()) {
            System.out.println("Keys with value '" + value + "': " + keysWithGivenValue);
        } else {
            System.out.println("No keys found with value '" + value + "'.");
        }
    }


}