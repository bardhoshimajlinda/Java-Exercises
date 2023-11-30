package Functional.Tasks;

import java.util.List;
import java.util.function.Predicate;

// Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
public class Task16 {
    public static void main(String[] args) {
        List<String> list = List.of("Red", "Blue","Black", "White","Brown", "Cherry");
        Predicate<String> containsWord = list::contains;

        System.out.println(containsWord.test("Blue"));
    }
}
