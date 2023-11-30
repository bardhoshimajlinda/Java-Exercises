package Functional.Tasks;

import java.util.Arrays;
import java.util.List;

// Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
public class Task15 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);

        int sumSquaresEven = integerList.stream()
                .filter(num -> num%2==0)
                .mapToInt(n-> n*n)
                .sum();

        int sumSquaresOdd = integerList.stream()
                .filter(num -> num%2 !=0)
                .mapToInt(n-> n*n)
                .sum();

        System.out.println(sumSquaresEven);
        System.out.println(sumSquaresOdd);
    }
}
