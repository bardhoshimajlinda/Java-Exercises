package Functional.Tasks.Streams;

import java.util.Arrays;
import java.util.List;

//  Write a Java program to convert a list of strings to uppercase or lowercase using streams.
public class TaskB {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Blue", "Black", "White", "Red", "Purple");
        List<String> toUppercaseList = list.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(toUppercaseList);

        List<String> toLowerCaseList = list.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println(toLowerCaseList);
    }
}
