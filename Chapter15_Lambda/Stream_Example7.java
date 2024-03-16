package Chapter15_Lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Stream_Example7 {
    public static void main(String[] args) {
        List<Integer[] > list = Arrays.asList(new Integer[][]{{1,2},{3,4},{5,6}});
        list.stream().map(Arrays::stream).forEach((i) -> System.out.println(i + " "));
        System.out.println();
        list.stream().flatMap(Arrays::stream).forEach((i) -> System.out.print(i + " "));
    }
}
