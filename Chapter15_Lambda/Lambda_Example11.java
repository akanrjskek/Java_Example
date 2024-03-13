package Chapter15_Lambda;

import java.util.function.*;

public class Lambda_Example11 {

    static void makeArrMethod(IntSupplier is, int[] arr){
        for(int i = 0; i < arr.length; ++i){
            arr[i] = is.getAsInt();
        }
    }

    static void printMethod(IntConsumer ic, int[] arr){
        for(int i = 0; i < arr.length; ++i){
            ic.accept(arr[i]);
        }
    }

    static void printEvenMethod(IntConsumer ic, IntPredicate ip, int[] arr){
        for(int i = 0; i < arr.length; ++i){
            if(ip.test(arr[i])){
                ic.accept(arr[i]);
            }
        }
    }

    static void printStringMethod(IntFunction<String> ifunc, int[] arr){
        String s = "";
        for(int i = 0; i < arr.length; ++i){
            s += ifunc.apply(arr[i]);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        IntConsumer ic = (i) -> System.out.print("i = " + i + " ");
        IntSupplier is = () -> (int)(Math.random()*10) + 1;
        IntFunction<String> ifunc = (i) -> Integer.toString(i);
        IntPredicate ip = (i) -> i % 2 == 0;
        makeArrMethod(is,arr);
        printMethod(ic,arr);
        System.out.println();
        printEvenMethod(ic,ip,arr);
        System.out.println();
        printStringMethod(ifunc,arr);
    }
}
