package Chapter3_Operator;

public class Operator_ex9 {
    public static void main(String[] args) {
        int a = 3;
        double d = 3.0;
        //System.out.println(a/0); // java.lang.ArithmeticException: / by zero 에러 발생
        //System.out.println(a%0); // java.lang.ArithmeticException: / by zero 에러 발생
        System.out.println(d%0);
        System.out.println(d/0);
    }
}
