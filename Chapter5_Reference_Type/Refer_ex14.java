package Chapter5_Reference_Type;

import java.util.Arrays;
import java.util.Comparator;

public class Refer_ex14 {
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("arr = " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println();

        Integer[] ARR = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("ARR = " + Arrays.toString(ARR));
        Arrays.sort(ARR,Comparator.reverseOrder());
        System.out.println("ARR = " + Arrays.toString(ARR));
    }
}
