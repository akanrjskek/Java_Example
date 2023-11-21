package Chapter3_Operator;

public class Operator_ex16 {
    public static void main(String[] args) {
        int a = 16;
        System.out.printf("%d\t    = %4d \t%32s\n", a, a, Integer.toBinaryString(a));
        System.out.printf("%d >> %d = %4d \t%32s\n", a, 1, a >> 1, Integer.toBinaryString(a >> 1));
        System.out.printf("%d >> %d = %4d \t%32s\n", a, 2, a >> 2, Integer.toBinaryString(a >> 2));
        System.out.printf("%d >> %d = %4d \t%32s\n", a, 3, a >> 3, Integer.toBinaryString(a >> 3));
        System.out.printf("%d >> %d = %4d \t%32s\n", a, 4, a >> 4, Integer.toBinaryString(a >> 4));
        System.out.printf("%d << %d = %4d \t%32s\n", a, 1, a << 1, Integer.toBinaryString(a << 1));
        System.out.printf("%d << %d = %4d \t%32s\n", a, 2, a << 2, Integer.toBinaryString(a << 2));
        System.out.printf("%d << %d = %4d \t%32s\n", a, 3, a << 3, Integer.toBinaryString(a << 3));
        System.out.printf("%d << %d = %4d \t%32s\n", a, 4, a << 4, Integer.toBinaryString(a << 4));
    }
}
