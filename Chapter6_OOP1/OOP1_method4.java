package Chapter6_OOP1;

import java.util.Arrays;

public class OOP1_method4 {
    public static void method(int[] arr){
        System.out.println(Arrays.toString(arr));
        arr[2] = 100;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        method(a);
        System.out.println(Arrays.toString(a));
    }
}
