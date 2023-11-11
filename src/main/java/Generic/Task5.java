package Generic;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.
public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(numbers + " in reverse order: " + reverseList(numbers));
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> newList = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
}
