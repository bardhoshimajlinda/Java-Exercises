package Generic;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Write a Java program to create a generic method that takes a list of any type and returns the frequency of each element on the list.
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,1,1,2,3,4);
        findFrequency(integerList);

        List<String> stringList = List.of("Anna", "Leo", "John", "Leo");
        findFrequency(stringList);

        List<Character> characterList = List.of('a','b','a','a');
        findFrequency(characterList);

    }

    public static <T> void findFrequency(List<T> myList) {
        Map<T,Integer> map = new HashMap<>();
        for (T element : myList) {
            if (map.containsKey(element)) {
                int repeted = 0;
                repeted = map.get(element);
                repeted++;
                map.put(element,repeted);
            } else {
                map.put(element,1);
            }
        }
        printMap(map);
    }

    public static <K,V> void printMap(Map<K,V> map) {
        for (Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
