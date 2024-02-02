package Chapter9_Practice;

public class Practice1_1 {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println("0을 나누는 수로 사용할 수 없습니다.");
        }
    }
}
