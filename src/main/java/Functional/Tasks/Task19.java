package Functional.Tasks;

import java.util.Arrays;
import java.util.Comparator;

// Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
public class Task19 {
    public static void main(String[] args) {
        Integer [] numbers = {1, 2, 3, 4, 5, 6, 7};
        Integer secondSmallest = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        Integer secondLargest = Arrays.stream(numbers)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("The second largest element in the array is " + secondLargest);
        System.out.println("The second smallest element in the array is " + secondSmallest);
    }
}
