package Functional.Tasks.Streams;

import java.util.Arrays;
import java.util.List;

// Write a Java program to find the maximum and minimum values in a list of integers using streams.
public class TaskG {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,8,5,12,6,7,33,-1,2);
        int minValue  = list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        int maxValue = list.stream()
                .max(Integer::compare)
                .orElse(null);

        System.out.println("The maximum value in the list is " + maxValue);
        System.out.println("The minimum value in the list is " + minValue);

    }
}
