package Chapter15_Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_Example5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana","candy","apple");
        list.stream().sorted().forEach((i) -> System.out.print(i + " "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach((i)->System.out.print(i + " "));
    }
}
