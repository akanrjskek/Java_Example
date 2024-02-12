package Chapter11_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Example5 {
    //순차적 요소 탐색 메서드
    public static long getMethod(List list){
        long starttime = System.nanoTime();
        for(int i = 0; i < 10000; ++i){
            String s = list.get(i).toString();
        }
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    //순차적 요소 추가 메서드
    public static long addMethod1(List list){
        long starttime = System.nanoTime();
        for(int i = 0; i < 1000000; ++i){
            list.add(i);
        }
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    //순차적 요소 삭제 메서드
    public static long deleteMethod1(List list){
        long starttime = System.nanoTime();
        for(int i = 0; i < 10000; ++i){
            list.remove(list.size() - 1);
        }
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    //중간 요소 추가 메서드
    public static long addMethod2(List list){
        long starttime = System.nanoTime();
        for(int i = 0; i < 10000; ++i){
            list.add(1000, 10);
        }
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    //중간 요소 삭제 메서드
    public static long deleteMethod2(List list){
        long starttime = System.nanoTime();
        for(int i = 0; i < 10000; ++i){
            list.remove(10);
        }
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>(1000000);
        LinkedList<Integer> linkedlist = new LinkedList<>();

        long a = addMethod1(arrlist);
        long b = addMethod1(linkedlist);
        System.out.println("arrlist 순차적 요소 추가 메서드 걸린 시간: " + a + "ns");
        System.out.println("linkedlist 순차적 요소 추가 메서드 걸린 시간: " + b + "ns");

        a = getMethod(arrlist);
        b = getMethod(linkedlist);
        System.out.println("arrlist 순차적 요소 탐색 메서드 걸린 시간: " + a + "ns");
        System.out.println("linkedlist 순차적 요소 탐색 메서드 걸린 시간: " + b + "ns");

        a = deleteMethod1(arrlist);
        b = deleteMethod1(linkedlist);
        System.out.println("arrlist 순차적 요소 삭제 메서드 걸린 시간: " + a + "ns");
        System.out.println("linkedlist 순차적 요소 삭제 메서드 걸린 시간: " + b + "ns");

        a = addMethod2(arrlist);
        b = addMethod2(linkedlist);
        System.out.println("arrlist 중간 요소 추가 메서드 걸린 시간: " + a + "ns");
        System.out.println("linkedlist 중간 요소 추가 메서드 걸린 시간: " + b + "ns");

        a = deleteMethod2(arrlist);
        b = deleteMethod2(linkedlist);
        System.out.println("arrlist 중간 요소 삭제 메서드 걸린 시간: " + a + "ns");
        System.out.println("linkedlist 중간 요소 삭제 메서드 걸린 시간: " + b + "ns");
    }
}
