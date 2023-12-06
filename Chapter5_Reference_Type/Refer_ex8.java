package Chapter5_Reference_Type;
import java.util.Arrays;
import java.util.List;

public class Refer_ex8 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(arr);
        for(int i = 0; i < list.size(); ++i){
            System.out.printf("%d ", list.get(i));
        }
        System.out.println();
    }
}
