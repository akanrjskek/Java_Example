package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Example2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,4,4,3,5);
        Stream<Integer> stream = list.stream().distinct();
        stream.forEach((i) -> System.out.print(i + " "));
    }
}
