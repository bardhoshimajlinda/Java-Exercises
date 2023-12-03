package JavaAdvanceCoding;

import java.util.function.Predicate;

/* Implement the generic partOf method, which will return % of items satisfying the condition based on any
type of array and the function indicated as parameters. */
public class Exercise29 {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6};
        Predicate<Integer> predicate = value -> value % 2 == 0;
        System.out.println(partOf(array, predicate));
    }

    public static <T> double partOf(T[] array, Predicate<T> predicate) {
        int count = 0;
        for (T element : array) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return (double) count /array.length;
    }
}
