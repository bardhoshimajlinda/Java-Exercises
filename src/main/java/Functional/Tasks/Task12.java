package Functional.Tasks;

import java.util.Arrays;

//  Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
public class Task12 {
    public static void main(String[] args) {

        Integer sum = Arrays.asList(1, 2, 34, 6, 7, 8, -1).stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        Integer multipleResult = Arrays.asList(1, 2, 34, 6, 7, 8, -1).stream()
                .reduce(1, (a,b) -> a*b);
        System.out.println(multipleResult);



    }
}
