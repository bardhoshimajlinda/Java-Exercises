package Generic;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.
public class Task8 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        map.put(4,1);
        printMap(map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"Monday");
        map1.put(2,"Tuesday");
        map1.put(3,"Sunday");
        map1.put(4,"Monday");
        printMap(map1);
    }

    public static <K, V> void printMap(Map<K,V> map) {
        for (Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
