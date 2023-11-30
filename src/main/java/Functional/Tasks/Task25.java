package Functional.Tasks;

import java.util.function.Function;

//Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.
public class Task25 {
    public static void main(String[] args) {
        int number = 42;

        Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);

        String binaryRepresentation = toBinary.apply(number);

        System.out.println("Binary representation of " + number + ": " + binaryRepresentation);
    }
}
