package Chapter15_Lambda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Example6 {
    public static void main(String[] args) {
        Stream<String> stringStream = Arrays.stream(new String[]{"1", "2", "3"});
        IntStream intStream = stringStream.mapToInt(Integer::parseInt);
        System.out.println(intStream.sum());
    }
}
