package Chapter15_Lambda;

import java.util.function.Predicate;

public class Lambda_Example8 {

    static int percentageMethod(Predicate<Double> p){
        int cnt = 0;
        for(int i = 0; i < 100; ++i){
            double d = Math.random();
            if(p.test(d)){
                cnt += 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Predicate<Double> p = (d) -> d < 0.5;
        System.out.println("100개의 무작위 0 ~ 1사이의 수 중 0.5가 넘는 수는 " + percentageMethod(p) + "개 입니다.");
    }
}
