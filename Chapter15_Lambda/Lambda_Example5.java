package Chapter15_Lambda;

import java.util.function.BiConsumer;

public class Lambda_Example5 {

    static void sumDoubleValue(BiConsumer<Double, Double> bc){
        for(int i = 0; i < 5; ++i){
            double d1 = Math.random();
            double d2 = Math.random();
            bc.accept(d1,d2);
        }
    }

    public static void main(String[] args) {
        BiConsumer<Double, Double> bc = (d1, d2) -> System.out.println(d1 + d2);
        sumDoubleValue(bc);
    }
}
