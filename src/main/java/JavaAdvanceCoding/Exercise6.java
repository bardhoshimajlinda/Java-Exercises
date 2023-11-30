package JavaAdvanceCoding;

import java.util.Map;
import java.util.TreeMap;

//Create a method that accepts TreeMap and prints the first and last EntrySet in the console.
public class Exercise6 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"JavaScript");
        map.put(4,"PHP");

        printEntrySet(map);

    }

    public static void printEntrySet(TreeMap<Integer,String> map) {
        System.out.println("First EntrySet : " + map.firstEntry());
        System.out.println("Last EntrySet : " + map.lastEntry());
    }
}
