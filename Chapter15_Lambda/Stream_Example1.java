package Chapter15_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Example1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Stream<Integer> collection = list.stream();
        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3});
        collection.forEach((i) -> System.out.print(i + " "));
        System.out.println();
        stream.forEach((i) -> System.out.print(i + " "));
        System.out.println();
    }
}
