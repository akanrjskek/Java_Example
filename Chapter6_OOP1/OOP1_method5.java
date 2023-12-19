package Chapter6_OOP1;

import java.util.Arrays;

public class OOP1_method5 {
    public static int[] arr_return(){
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = arr_return();
        System.out.println(Arrays.toString(a));
    }
}
