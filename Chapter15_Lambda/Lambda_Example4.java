package Chapter15_Lambda;

import java.util.function.Function;
import java.util.function.Supplier;

class Class{
    int i;

    Class(int i){
        this.i = i;
    }
}

public class Lambda_Example4 {
    public static void main(String[] args) {
        //Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f = Integer::parseInt;
        StringBuilder sb = new StringBuilder();
        sb.append("hello ");
        sb.append("world\n");
        Supplier<String> func = sb::toString;
        System.out.println(func.get());

        //Function<Integer, Class> s = (i) -> new Class(i);
        Function<Integer, Class> s = Class::new;
        Class c = s.apply(100);
        System.out.println(c);

        Function<Integer, int[]> arrfunc = int[]::new;
        int[] arr = arrfunc.apply(100);
        System.out.println(arr.length);
    }
}
