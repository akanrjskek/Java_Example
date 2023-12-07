package Chapter5_Reference_Type;

import java.util.Arrays;

public class Refer_ex13 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i = 0; i < arr1.length; ++i) {
            arr1[i] = 1;
        }
        Arrays.fill(arr2,1);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
