package Chapter15_Lambda;

import java.util.function.Predicate;

public class Lambda_Example13 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (i) -> (i < 10);
        Predicate<Integer> p2 = (i) -> (i % 3 == 0);
        Predicate<Integer> p1andp2 = p1.and(p2);
        Predicate<Integer> p1orp2 = p1.or(p2);
        Predicate<Integer> notp1 = p1.negate();
        Predicate<Integer> notp2 = p2.negate();

        for(int i = 0; i < 3; ++i){
            int randominteger = (int)(Math.random() * 100 + 1);
            System.out.println("case" + (i+1) + ": " + randominteger);
            if(p1andp2.test(randominteger)){
                System.out.println("i < 10 && i % 3 == 0");
            }
            if(p1orp2.test(randominteger)){
                System.out.println("i < 10 || i % 3 == 0");
            }
            if(notp1.test(randominteger)){
                System.out.println("i >= 10");
            }
            if(notp2.test(randominteger)){
                System.out.println("i % 3 != 1");
            }
        }
    }
}
