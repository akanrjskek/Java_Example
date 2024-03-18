package Chapter15_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice1 {
    public static void main(String[] args) {
        String[] str = {"10","20","30","40","50"};
        IntStream intStream = Arrays.stream(str).mapToInt(Integer::parseInt);
        System.out.println(intStream.sum());
    }
}
