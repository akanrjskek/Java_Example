package Chapter3_Operator;

public class Operator_ex10 {
    public static void main(String[] args) {
        char c1 = 65;
        //char c2 = c1 + 'A'; // c1 + 'A'의 연산 결과가 int타입이므로 char 타입에 저장 불가.
        int i1 = c1 + 'B' - 'A';
        System.out.println((char)i1);
    }
}
