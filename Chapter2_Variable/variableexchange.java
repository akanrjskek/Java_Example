package Chapter2_Variable;

public class variableexchange {
    // 변수값 서로 바꾸기
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //logic
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
