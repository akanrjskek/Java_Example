package Chapter3_Operator;

public class Operator_ex4 {
    public static void main(String[] args) {
        short b = -10;
        //byte a = +b; // +b의 결과 타입이 int 타입이기 때문에 타입 에러 발생.
        int b1 = -b;
        System.out.println(Check.typeof(b1));
        System.out.println(b1);
    }
}
