package Functional.Tasks.Streams;

import java.util.Arrays;
import java.util.List;

// Write a Java program to find the second smallest and largest elements in a list of integers using streams.
public class TaskH {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,8,5,12,6,7,33,-1,2);

        int minValue  = integerList.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        int maxValue = integerList.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("The maximum value in the list is " + maxValue);
        System.out.println("The minimum value in the list is " + minValue);
    }
}
