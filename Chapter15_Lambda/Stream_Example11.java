package Chapter15_Lambda;

import java.util.stream.IntStream;

public class Stream_Example11 {
    public static void main(String[] args) {
        System.out.print("직렬 스트림 forEach() 실행: ");
        IntStream.range(1,10).forEach((i) -> System.out.print(i + " "));
        System.out.print("\n병렬 스트림 forEach() 실행: ");
        IntStream.range(1,10).parallel().forEach((i) -> System.out.print(i + " "));
        System.out.print("\n병렬 스트림 forEachOrdered 실행: ");
        IntStream.range(1,10).parallel().forEachOrdered((i) -> System.out.print(i + " "));
        System.out.println();
    }
}
