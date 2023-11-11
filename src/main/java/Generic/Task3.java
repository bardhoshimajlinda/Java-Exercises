package Generic;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
public class Task3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(2);

        sumOfNumbers(list);
    }

    public static <T extends Number> void sumOfNumbers(List<T> numbers) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (T number : numbers) {
            if (number.intValue()%2 == 0) {
                sumOfEven += number.intValue();
            } else {
                sumOfOdd += number.intValue();
            }
        }
        System.out.println("Sum of even numbers is " + sumOfEven);
        System.out.println("Sum of odd numbers is " + sumOfOdd);
    }
}
