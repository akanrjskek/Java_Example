package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;

public class Stream_Example8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.stream().peek((i) -> System.out.println(i)).
                map((i -> i * 2)).
                forEach((i) -> System.out.println(i));
    }
}
