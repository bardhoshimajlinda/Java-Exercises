package Functional.Tasks;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

// Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
public class Task24 {
    public static void main(String[] args) {
        long number = 315;

        long largestPrimeFactor = findLargestPrimeFactor(number);

        System.out.println("Largest prime factor of " + number + ": " + largestPrimeFactor);
    }

    public static long findLargestPrimeFactor(long number) {
        LongPredicate isPrime = n -> n > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);

        return LongStream.rangeClosed(2, number)
                .filter(factor -> number % factor == 0 && isPrime.test(factor))
                .max()
                .orElse(1);
    }
}
