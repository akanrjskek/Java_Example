package Chapter3_Operator;

public class Operator_ex12 {
    public static void main(String[] args) {
        double d = 0.1;
        float f = 0.1f;
        System.out.println(d == f);
        System.out.println(f);
        System.out.println((double)f);
        System.out.println((double)f == f);
        System.out.printf("f = %1.30f%n", f);
        System.out.printf("d = %1.30f%n", d);
    }
}
