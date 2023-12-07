package Chapter5_Reference_Type;

import java.util.Arrays;

public class Refer_ex12 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));
        System.out.println(arr1.equals(arr3));
    }
}

