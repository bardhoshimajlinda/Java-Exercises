package Functional.Tasks;

import java.util.Arrays;
import java.util.List;

// Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
public class Task5 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday","Sunday");

        myList.sort((s1,s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("Sorted list: " + myList);
    }
}
