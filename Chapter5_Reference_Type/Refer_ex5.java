package Chapter5_Reference_Type;

public class Refer_ex5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};
        for(int i = 0; i < a.length; ++i){
            System.out.printf("a[%d] = %d\nb[%d] = %d\n", i, a[i], i, b[i]);
        }
    }
}
