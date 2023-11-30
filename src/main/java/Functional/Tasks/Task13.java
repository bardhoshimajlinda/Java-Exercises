package Functional.Tasks;

import java.util.function.ToIntFunction;
import java.util.stream.Stream;

// Write a Java program to implement a lambda expression to count words in a sentence.
public class Task13 {
    public static void main(String[] args) {
        String test = "This is a test";

        ToIntFunction<String> wordCount = sentence -> Stream.of(test.split("\\s+"))
                .filter(word-> !word.isEmpty())
                .mapToInt(word -> 1)
                .sum();

        int count = wordCount.applyAsInt(test);
        System.out.println(count);
    }
}


