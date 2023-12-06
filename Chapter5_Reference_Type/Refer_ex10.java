package Chapter5_Reference_Type;

import java.util.Arrays;

public class Refer_ex10 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr2));
    }
}
