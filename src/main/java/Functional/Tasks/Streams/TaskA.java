package Functional.Tasks.Streams;

import java.util.List;

//Write a Java program to calculate the average of a list of integers using streams.
public class TaskA {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8);

        double average = integerList.stream()
                        .mapToDouble(Integer::doubleValue)
                                .average()
                                        .orElse(0.0);

        System.out.println(average);
    }
}
