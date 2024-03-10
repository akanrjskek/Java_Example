package Chapter15_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Lambda_Example7 {
    static <T,U,R> void bePlus(BiFunction<T,U,R> f, List<T> list1, List<U> list2){
        List<R> resultList = new ArrayList<>();
        for(int i = 0; i < list1.size(); ++i){
            resultList.add(f.apply(list1.get(i),list2.get(i)));
        }
        System.out.println(resultList);
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("10","20","30","40","50");
        List<String> list2 = Arrays.asList("5","4","3","2","1");
        BiFunction<String, String, Integer> bf = (a,b) -> Integer.parseInt(a) + Integer.parseInt(b);
        bePlus(bf,list1,list2);
    }
}
