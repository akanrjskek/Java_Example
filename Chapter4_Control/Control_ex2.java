package Chapter4_Control;

public class Control_ex2 {
    public static void main(String[] args) {
        int a = 10;
        if(false)
            a = a + 1;
        a = a + 1;
        System.out.println(a); // if문 중괄호가 없어 a = a + 1; 한번만 실행 됨.
    }
}
