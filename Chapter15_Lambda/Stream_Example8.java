package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;

public class Stream_Example8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        int sum_list = list.stream().peek((i) -> System.out.print(i + " ")).
                mapToInt(Integer::intValue).
                sum();
        System.out.println();
        System.out.println(sum_list);
    }
}
