package Chapter15_Lambda;

import java.util.function.BiPredicate;

public class Lambda_Example9 {

    static double BiggerThen(BiPredicate<Double, Double> bp){
        int cnt = 0;
        for(int i =0; i < 100; ++i){
            double d1 = Math.random();
            double d2 = Math.random();
            if(bp.test(d1,d2)){
                cnt +=1;
            }
        }
        return cnt / 100.0;
    }

    public static void main(String[] args) {
        BiPredicate<Double, Double> bp = (d1,d2 ) -> d1 > d2;
        System.out.println("100가지의 무작위 두 수 중 앞의 수가 더 클 가능성은 " + BiggerThen(bp) + "% 입니다.");
    }
}
