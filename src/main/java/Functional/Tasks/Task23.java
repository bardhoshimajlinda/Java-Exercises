package Functional.Tasks;

import java.util.List;

//Write a Java program to implement a lambda expression to find the average length of strings in a list.
public class Task23 {
    public static void main(String[] args) {
        List<String> list = List.of("Red", "Blue","Black", "White","Brown", "Cherry");
        double averageLength = list.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println(averageLength);

    }

}
