package Chapter11_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println("q의 가장 앞에 있는 수는 " + q.peek() + "입니다.");
        int a = q.poll();
        System.out.println("q의 가장 앞에 있는 수 " + a + "을 제거하였습니다.");
        System.out.println("q의 가장 앞에 있는 수는 " + q.peek() + "입니다.");
    }
}
