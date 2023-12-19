package Chapter6_OOP1;

import java.util.Arrays;

public class OOP1_recursive1 {

    public static void recursive(int[] arr, int index, int value){
        if(index == 5) return;
        arr[index] = value;
        recursive(arr,index + 1, value + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        recursive(a,0,1);
        System.out.println(Arrays.toString(a));
    }
}
