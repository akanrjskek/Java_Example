package Chapter15_Lambda;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambda_Example13 {
    public static void main(String[] args) {
        Integer[] intarr = {1,2,3,4,5,6,7,8,9,10};

        Stream.of(intarr).parallel().forEachOrdered(System.out::println); // parallele(병렬) 사용할 때 forEachOrdered 사용

        if(Stream.of(intarr).noneMatch(i -> i > 10)){
            System.out.println("10이상의 숫자가 없습니다.");
        }

        Optional<Integer> a = Stream.of(intarr).filter(i -> i < 10).findFirst();
        System.out.println(a);

        IntStream intStream1 = Stream.of(intarr).mapToInt(i -> i);
        int sum = intStream1.reduce(0, (b,c) -> b + c);
        System.out.println(sum);
    }
}
