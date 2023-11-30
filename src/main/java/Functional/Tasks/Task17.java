package Functional.Tasks;

import java.util.List;

// Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
public class Task17 {
    public static void main(String[] args) {
        List<String> list = List.of("Red", "Blue","Black", "White","Brown", "Cherry");

        int maxLength = list.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        int minLength = list.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);

        System.out.println("Length of the smallest string is " + minLength);
        System.out.println("Length of the longest string is " + maxLength);
    }
}
