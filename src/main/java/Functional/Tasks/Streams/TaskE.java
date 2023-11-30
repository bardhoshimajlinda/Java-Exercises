package Functional.Tasks.Streams;

import java.util.List;

// Write a Java program to count the number of strings in a list that start with a specific letter using streams.
public class TaskE {
    public static void main(String[] args) {
        List<String> colors = List.of("Red","Blue","Yellow","Black", "Brown", "Rose", "Grey");

       long count = colors.stream()
                .filter(el -> el.startsWith("B"))
                .count();
        System.out.println("The number of strings on the list that starts with the letter 'B' is " + count);
    }
}
