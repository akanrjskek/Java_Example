package Chapter9_Exception;

public class ArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if(b != 0){
            System.out.println(a / b);
        }
        else{
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
