package Chapter3_Operator;

public class Operator_ex15 {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf(" a = %4d \t%32s%n", a, Integer.toBinaryString(a));
        int b = ~a;
        System.out.printf(" b = %4d \t%s%n", b, Integer.toBinaryString(b));
    }
}
