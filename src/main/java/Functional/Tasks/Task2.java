package Functional.Tasks;

import java.util.function.Predicate;

//Write a program to implement a lambda expression to check if a given String is empty
public class Task2 {
    public static void main(String[] args) {
        Predicate<String> isEmptyChecker = str -> str.isEmpty();

        String emptyString= "";
        String nonEmptyString = "This is a test";

        System.out.println("Is the string empty? " + isEmptyChecker.test(emptyString));
        System.out.println("Is the string empty? " + isEmptyChecker.test(nonEmptyString));
    }
}
