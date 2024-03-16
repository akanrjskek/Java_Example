package Chapter15_Lambda;

import java.util.stream.Stream;

public class Stream_Example4 {
    public static void main(String[] args) {
        Stream<Double> random = Stream.generate(Math::random);
        random.limit(5).forEach((i) -> System.out.printf("%.3f\n", i));
    }
}
