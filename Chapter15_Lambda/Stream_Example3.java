package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Example3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = list.stream().filter((i) -> i % 2 == 0);
        stream.forEach((i) -> System.out.print(i + " "));
    }
}
