package Chapter3_Operator;

public class Operator_ex17 {
    public static void main(String[] args) {
        int a = -16;
        System.out.printf("%d \t = %10d \t%32s\n",a,a,Integer.toBinaryString(a));
        System.out.printf("%d >> %d = %10d \t%32s\n",a,1,a >> 1,Integer.toBinaryString(a >> 1));
        System.out.printf("%d >>> %d = %10d \t%32s\n",a,1,a >>> 1,Integer.toBinaryString(a >>> 1));
    }
}
