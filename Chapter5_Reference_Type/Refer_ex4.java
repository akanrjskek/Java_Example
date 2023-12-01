package Chapter5_Reference_Type;

public class Refer_ex4 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int b[] = new int[5];
        for(int i = 0; i < a.length; ++i){
            a[i] = i + 1;
            b[i] = i + 1;
        }
        for(int i = 0; i < a.length; ++i){
            System.out.printf("a[%d] = %d\nb[%d] = %d\n", i, a[i], i, b[i]);
        }
    }
}
