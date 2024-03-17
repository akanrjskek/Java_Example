package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;

public class Stream_Example13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30,20,10,50,40);
        int sum_list = list.stream().reduce(0, (a,b) -> a+b);
        int len_list = list.stream().reduce(0, (a,b) -> a+1);
        int max = list.stream().reduce(Integer.MIN_VALUE, (a,b) -> a>b ? a:b);
        int min = list.stream().reduce(Integer::min).orElse(Integer.MAX_VALUE);
        System.out.println("list 요소의 합: " + sum_list);
        System.out.println("list 요소의 개수: " + len_list);
        System.out.println("list 요소의 개수: " + max);
        System.out.println("list 요소의 개수: " + min);
    }
}
