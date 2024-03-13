package Chapter15_Lambda;

import java.util.function.Function;

public class Lambda_Example12 {
    public static void main(String[] args) {
        Function<Integer,Integer> plus = (i) -> i + i;
        Function<Integer,Integer> multiple = (i) -> i*i;

        Function<Integer, Integer> andthen1 = plus.andThen(multiple);
        Function<Integer, Integer> andthen2 = multiple.andThen(plus);
        Function<Integer, Integer> compose1 = plus.compose(multiple);
        Function<Integer, Integer> compose2 = multiple.compose(plus);

        int a = andthen1.apply(3);
        int b = andthen2.apply(3);
        int c = compose1.apply(3);
        int d = compose2.apply(3);

        System.out.println("andthen1: " + a);
        System.out.println("andthen2: " + b);
        System.out.println("compose1: " + c);
        System.out.println("compose2: " + d);
    }
}
