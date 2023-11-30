package Functional.Tasks.Streams;

import java.util.Arrays;
import java.util.List;

//Write a Java program to remove all duplicate elements from a list using streams.
public class TaskD {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,2,3,3,3);
        List<Integer> uniqueElements = list.stream()
                .distinct()
                .toList();

        System.out.println(uniqueElements);
    }
}
