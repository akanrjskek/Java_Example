package Chapter4_Control_Statement;
import java.util.Scanner;

public class Control_ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("숫자를 입력하세요: ");
            n = sc.nextInt();
            System.out.println("n = " + n);
        }while(n != 0);
    }
}
