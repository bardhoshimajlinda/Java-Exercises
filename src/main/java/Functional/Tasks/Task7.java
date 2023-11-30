package Functional.Tasks;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,3,3,2,2,2,0,0);

        List<Integer> uniqueList = new ArrayList<>(list.stream()
                .distinct()
                .toList());


        System.out.println(uniqueList);

    }
}
