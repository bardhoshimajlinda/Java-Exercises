package Functional.Tasks;

import java.util.Arrays;
import java.util.List;

//Write a Java program to implement lambda expression to convert a list of strings to uppercase and lowercase.
public class Task3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday","Sunday");

        myList.forEach(str -> System.out.println("Uppercase: " + str.toUpperCase()));
        System.out.println();
        myList.forEach(str -> System.out.println("Lowercase: " + str.toLowerCase()));
    }
}
