package Chapter11_Collections;

import java.util.Queue;
import java.util.LinkedList;
public class Queue_Example2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("q의 가장 앞에 있는 수는 " + q.peek() + "입니다.");
        int a = q.poll();
        System.out.println("q의 가장 앞에 있는 수 " + a + "을 제거하였습니다.");
        System.out.println("q의 가장 앞에 있는 수는 " + q.peek() + "입니다.");
    }
}
