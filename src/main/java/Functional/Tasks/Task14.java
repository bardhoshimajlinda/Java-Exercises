package Functional.Tasks;

import java.util.function.Predicate;

//  Write a Java program to implement a lambda expression to check if a given string is a palindrome.
public class Task14 {
    public static void main(String[] args) {
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        };

        String isPalindrome1 = "level";
        String isPalindrome2 = "hello";

        System.out.println(isPalindrome.test(isPalindrome1));
        System.out.println(isPalindrome.test(isPalindrome2));
    }
}
