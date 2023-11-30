package Functional.Tasks;

import java.util.stream.LongStream;

public class Task21 {
    public static void main(String[] args) {
        //Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
        int startRange = 2;
        int endRange = 20;

        long sumOfPrimes = calculateSumOfPrimes(startRange, endRange);

        System.out.println("Sum of prime numbers between " + startRange + " and " + endRange + ": " + sumOfPrimes);
    }

    public static boolean isPrime(long number) {
        return number > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(number)).noneMatch(i -> number % i == 0);
    }

    public static long calculateSumOfPrimes(int start, int end) {
        return LongStream.rangeClosed(start, end)
                .filter(Task21::isPrime)
                .sum();
    }
}
