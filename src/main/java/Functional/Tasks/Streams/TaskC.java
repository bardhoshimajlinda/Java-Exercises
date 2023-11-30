package Functional.Tasks.Streams;

import java.util.List;

// Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
public class TaskC {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5);

        int evenSum = integerList.stream()
                .filter(n -> n%2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("The sum of all even numbers is " + evenSum);

        int oddSum = integerList.stream()
                .filter(n->n%2 !=0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("The sum of all odd numbers is " + oddSum);
    }
}
