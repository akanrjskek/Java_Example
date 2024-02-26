package Chapter15_Lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class Lambda_Example9 {
    public static void main(String[] args) {
        String sarr1[] = {"abc", "efg", "hij"};
        String sarr2[] = {"ABC", "EFG", "HIJ"};

        Stream<String[]> strarrStream =  Stream.of(sarr1,sarr2);

        Stream<String> stringStream = strarrStream.flatMap(Arrays::stream);
        stringStream.forEach(System.out::println);

        String[] stringLine = {"I believe i can fly", "This is apple"};

        stringStream = Arrays.stream(stringLine);

        stringStream.flatMap(s -> Stream.of(s.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::print);
        System.out.println();
    }
}
