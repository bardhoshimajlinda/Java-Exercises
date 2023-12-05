package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbersSet = new HashSet<>();
        System.out.println(numbersSet.isEmpty());
        numbersSet.add(2);
        numbersSet.add(4);
        numbersSet.add(3);
        numbersSet.add(3);
        numbersSet.forEach(System.out::println);

        Set<Integer> numberSet = new TreeSet<>();
        numberSet.add(1);
        numberSet.add(3);
        numberSet.add(3);
        numberSet.add(2);
        numberSet.forEach(System.out::println);

        Set<Integer> numberSet1 = new LinkedHashSet<>();
        numberSet1.add(1);
        numberSet1.add(3);
        numberSet1.add(3);
        numberSet1.add(1);
        numberSet1.add(0);
        numberSet1.forEach(System.out::println);
    }
}
