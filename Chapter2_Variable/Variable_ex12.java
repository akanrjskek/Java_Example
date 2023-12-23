package Chapter2_Variable;

public class Variable_ex12 {
    public static void main(String[] args) {
        short s = 10;
        int a = 10;
        int b = a + s; // s의 타입이 short이므로 int로 타입 변환되어 연산된다.
        System.out.println(b);
    }
}
