package Chapter15_Lambda;

import java.util.function.BiFunction;

public class Lambda_Example14 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> max_lambda = (a,b) -> Math.max(a,b);
        BiFunction<Integer, Integer, Integer> max_method_reference = Math::max;
        int random_value1 = (int)(Math.random() * 100 + 1);
        int random_value2 = (int)(Math.random() * 100 + 1);
        if(max_lambda.apply(random_value1,random_value2) == random_value1){
            System.out.println(random_value1 + " > " + random_value2);
        }
        else{
            System.out.println(random_value2 + " > " + random_value1);
        }

        if(max_method_reference.apply(random_value1,random_value2) == random_value1){
            System.out.println(random_value1 + " > " + random_value2);
        }
        else{
            System.out.println(random_value2 + " > " + random_value1);
        }
    }
}
