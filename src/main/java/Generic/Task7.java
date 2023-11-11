package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Write a Java program to create a generic method that takes a list of any type and a predicate.
// It returns an array list containing only elements that satisfy the predicate.
public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,6);

        List<Integer> oddNumbers = filterList(numbers,n -> n % 2 != 0);
        System.out.println(oddNumbers);

        List<Integer> evenNumbers = filterList(numbers,n -> n % 2 == 0);
        System.out.println(evenNumbers);
    }

    public static  <T> List<T> filterList(List<T> list , Predicate <T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
