package Generic;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list.
// This method alternates the elements of each list.
public class Task6 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,1,1,1,1,1);
        List<Integer> list2 = List.of(0,0,0,0,0,0,0,0);
        mergeLists(list1,list2);
    }

    public static <T> void mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int maxLength = Math.max(list1.size(),list2.size());
        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }
        System.out.println(mergedList);
    }
}
