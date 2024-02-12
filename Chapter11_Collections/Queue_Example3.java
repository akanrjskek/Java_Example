package Chapter11_Collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue_Example3 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.addFirst(5);
        System.out.println(dq.peek());
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

        System.out.println("===================================");

        Iterator I = dq.iterator();
        Iterator dI = dq.descendingIterator();

        while(I.hasNext()){
            System.out.println(I.next());
        }

        System.out.println("===================================");

        while(dI.hasNext()){
            System.out.println(dI.next());
        }

    }
}
