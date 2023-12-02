package Chapter5_Reference_Type;
import java.util.Arrays;
public class Refer_ex8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int b = Arrays.compare(arr1,arr2);
        System.out.println(b);

    }
}
