package Functional.Tasks.Streams;

import java.util.Comparator;
import java.util.List;

// Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
public class TaskF {
    public static void main(String[] args) {
        List<String> colors = List.of("Red","Blue","Yellow","Black", "Brown", "Rose", "Grey");

        List<String> ascendingOrder = colors.stream()
                .sorted()
                .toList();
        System.out.println(ascendingOrder);

        List<String> descendingOrder = colors.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(descendingOrder);
    }
}
