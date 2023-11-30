package JavaAdvanceCoding;

import java.util.*;

// Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A.
public class Exercise1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(List.of("Red", "Black", "Blue", "Yellow", "Brown", "Rose", "Green"));
        List<String> sortedList = sortList(colors);

        System.out.println(sortedList);
    }
    public static List<String> sortList(List<String> colors) {
        colors.sort(Collections.reverseOrder());
        return colors;
    }
}
