package Functional.Tasks;

import java.util.Arrays;
import java.util.List;

// Write a Java program to implement a lambda expression to find the average of a list of doubles.
public class Task6 {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(2.3,2.1,4.1,1.2);

        double average = doubles.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(average);
    }
}
