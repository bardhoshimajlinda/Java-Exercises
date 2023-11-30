package Functional.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        List<Integer> evenNumbers = list.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());

        List<Integer> oddNumbers = list.stream()
                .filter(num -> num%2 !=0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
