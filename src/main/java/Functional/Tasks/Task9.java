package Functional.Tasks;

import java.util.function.Predicate;

// Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
public class Task9 {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i == 0){
                    return false;
                }
            }
            return true;
        };


        System.out.println(isPrime.test(7));
    }
}
