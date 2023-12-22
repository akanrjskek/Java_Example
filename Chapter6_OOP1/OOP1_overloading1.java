package Chapter6_OOP1;
import java.util.Arrays;

public class OOP1_overloading1 {
    public static void main(String[] args) {
        int[] a = {3,4,2,5,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{5,4,3,2,1};
        Arrays.sort(a,0,3);
        System.out.println(Arrays.toString(a));
    }
}
