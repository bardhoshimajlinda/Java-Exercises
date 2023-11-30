package Functional.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
public class Task11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,34,6,7,8,-1);

        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);

        Optional<Integer> min = list.stream()
                .min(Integer::compareTo);

        System.out.println("The maximum value in the list is " + max.orElse(null));
        System.out.println("The minimum value in the list is " + min.orElse(null));


    }
}
