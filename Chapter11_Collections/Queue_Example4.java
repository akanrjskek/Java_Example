package Chapter11_Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Example4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(1);
        pq.offer(3);
        pq.offer(2);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
