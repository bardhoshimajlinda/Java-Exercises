package Functional.Tasks;

import java.util.function.Predicate;

// Write a Java program to implement a lambda expression to check if a given number is a perfect square.
public class Task18 {
    public static void main(String[] args) {
        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        int number = 25;
        System.out.println("Is " + number + " a perfect square? " + isPerfectSquare.test(number));
    }
}
