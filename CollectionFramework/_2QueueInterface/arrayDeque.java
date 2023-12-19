package CollectionFramework._2QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(23);
        int first=deque.removeFirst();
        int last=deque.removeLast();

        System.out.println("First: "+first+"  last: "+last);
        deque.push(90);
        deque.push(80);

        System.out.println(deque);

    }
}
