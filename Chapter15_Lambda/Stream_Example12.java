package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;

public class Stream_Example12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().parallel().filter((i) -> i % 2 != 0).findAny());
        System.out.println(list.stream().filter((i) -> i % 2 != 0).findFirst());
        System.out.println(list.stream().allMatch((i) -> i < 6));
        System.out.println(list.stream().anyMatch((i) -> i < 6));
        System.out.println(list.stream().noneMatch((i) -> i < 6));
    }
}
