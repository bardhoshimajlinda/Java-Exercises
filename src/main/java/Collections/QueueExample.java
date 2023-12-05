package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> events = new LinkedList<>();
        events.offer("ButtonClicked");
        events.offer("MouseMoved");
        System.out.println(events.peek());
        System.out.println(events.poll());
        System.out.println(events.poll());
        System.out.println(events.isEmpty());
    }
}
