package Functional.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixed-case.
public class Task22 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("HELLO", "world", "MixedCase", "UPPERCASE");

        checkCase(strings, str -> str.equals(str.toUpperCase()), "All Uppercase");
        checkCase(strings, str -> str.equals(str.toLowerCase()), "All Lowercase");
        checkCase(strings, str -> !str.equals(str.toUpperCase()) && !str.equals(str.toLowerCase()), "Mixed Case");
    }

    public static void checkCase(List<String> strings, Predicate<String> condition, String caseType) {

        boolean allMatch = strings.stream().allMatch(condition);

        if (allMatch) {
            System.out.println("All strings are " + caseType);
        } else {
            System.out.println("Strings have " + caseType);
        }
    }
}