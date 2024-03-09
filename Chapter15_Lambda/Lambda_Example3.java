package Chapter15_Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Lambda_Example3 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer>  p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i/10*10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p,c,list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }

    private static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for(int i = 0; i < 10; ++i){
            list.add(s.get());
        }
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list){
        List<T> newList = new ArrayList<>();

        for(T t : list){
            newList.add(f.apply(t));
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.print("[");

        for(T t : list){
            if(p.test(t)){
                c.accept(t);
            }
        }

        System.out.println("]");
    }
}
