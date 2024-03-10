package Chapter15_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambda_Example6 {

    static <T,R> void beDouble(Function<T,R> f, List<T> list){
        List<R> resultList = new ArrayList<>();
        for(int i = 0; i < list.size(); ++i){
            resultList.add(f.apply(list.get(i)));
        }
        System.out.println(resultList);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = (a) -> a * 2;
        Function<String, String> f2 = (s) -> s + s;
        List<Integer> iList = Arrays.asList(1,2,3,4,5);
        List<String> sList = Arrays.asList("A","B","C");
        beDouble(f1, iList);
        beDouble(f2, sList);
    }
}
