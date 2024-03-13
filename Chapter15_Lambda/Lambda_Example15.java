package Chapter15_Lambda;

import java.util.Arrays;
import java.util.function.*;

class New_Class{
    int a;

    New_Class(){}
    New_Class(int a){
        this.a = a;
    }
}

public class Lambda_Example15 {
    public static void main(String[] args) {
        Supplier<New_Class> s = New_Class::new;
        Function<Integer, New_Class> f = New_Class::new;
        New_Class nc1 = s.get();
        New_Class nc2 = f.apply(10);

        Function<Integer, double[]> make_arr = double[]::new;
        double[] arr = make_arr.apply(10);
        for(int i = 0; i < arr.length; ++i){
            arr[i] = Math.random();
        }

        System.out.println(Arrays.toString(arr));
    }
}
