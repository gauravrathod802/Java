package CollectionFramework._2QueueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

        pq.add(12);
        pq.add(13);
        pq.add(14);
        pq.add(10);
        pq.add(19);

        System.out.println(pq);

        System.out.println(pq.peek());

        Iterator<Integer> itr=pq.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
