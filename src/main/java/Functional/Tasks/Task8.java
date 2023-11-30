package Functional.Tasks;

import java.util.function.LongUnaryOperator;

// Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
public class Task8 {
    public static void main(String[] args) {
       LongUnaryOperator factorial = n -> {
           long result = 1;
           for (long i = 1; i<=n; i++) {
               result *= i;
           }
           return result;
       };

        System.out.println(factorial.applyAsLong(4));

    }
}
