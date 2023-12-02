package JavaAdvanceCoding;

import java.util.*;
// TO CHECK !!
//Implement the following functionalities based on 100,000 element arrays with randomly selected values:
//1. return a list of unique items,
//2. return a list of elements that have been repeated at least once in the generated array,
//3. return a list of the 25 most frequently recurring items.
//Implement a method that de-duplicates items in the list. If a duplicate is found, it replaces it with a new
//random value that did not occur before. Check if the method worked correctly by calling method number 2.
public class Exercise14 {
    public static void main(String[] args) {
        List<Integer> randomList = generateRandomList(100000);

        // 1. List of unique items:
        List<Integer> uniqueList = uniqueItems(randomList);
        System.out.println("1. List of unique items count: " + uniqueList.size());

        // 2. List of elements that have been repeated at least once:
        List<Integer> repeatedItems = repeatedItems(randomList);
        System.out.println("2. List of repeated items count: " + repeatedItems.size());

        // Deduplicate items and check with repeatedItems method
        List<Integer> deduplicatedList = deDuplicate(new ArrayList<>(randomList));
        List<Integer> repeatedItemsAfterDeduplication = repeatedItems(deduplicatedList);
        System.out.println("3. List of repeated items after deduplication count: " + repeatedItemsAfterDeduplication.size());

        // Print the first few items of the deduplicated list for verification
        System.out.println("Deduplicated List (first 10 items): " + deduplicatedList.subList(0, Math.min(10, deduplicatedList.size())));
    }

    private static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    public static List<Integer> uniqueItems(List<Integer> list) {
        Set<Integer> uniqueItemsSet = new HashSet<>(list);
        return new ArrayList<>(uniqueItemsSet);
    }

    public static List<Integer> repeatedItems(List<Integer> list) {
        List<Integer> allElements = new ArrayList<>();
        List<Integer> duplicatesEl = new ArrayList<>();

        for (Integer el : list) {
            if (allElements.contains(el)) {
                duplicatesEl.add(el);
            }
            allElements.add(el);
        }
        return duplicatesEl;
    }

    public static List<Integer> get25MostFrequentlyRecurringItems(List<Integer> list) {
        Map<Integer, Integer> occurrencesMap = new HashMap<>();

        for (Integer el : list) {
            occurrencesMap.put(el, occurrencesMap.getOrDefault(el, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(occurrencesMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(25, sortedEntries.size()); i++) {
            result.add(sortedEntries.get(i).getKey());
        }

        return result;
    }

    public static List<Integer> deDuplicate(List<Integer> list) {
        Set<Integer> uniqueValues = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);

            if (uniqueValues.contains(element)) {
                int newRandomValue;
                do {
                    newRandomValue = random.nextInt();
                } while (uniqueValues.contains(newRandomValue));

                list.set(i, newRandomValue);
                uniqueValues.add(newRandomValue);
            } else {
                uniqueValues.add(element);
            }
        }

        return list;
    }
}


