package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        final Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(2);
        deque.offerFirst(1);

        System.out.println(deque.pollLast());
        System.out.println(deque.peekLast());
    }
}
