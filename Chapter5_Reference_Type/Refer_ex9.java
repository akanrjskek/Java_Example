package Chapter5_Reference_Type;
import java.util.Arrays;
import java.util.List;

public class Refer_ex9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);
    }
}
