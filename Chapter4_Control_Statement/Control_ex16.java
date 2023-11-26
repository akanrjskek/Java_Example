package Chapter4_Control_Statement;

public class Control_ex16 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; ++i){
            sum += i;
            System.out.printf("더해지는 수: %d\tsum = %d\n", i, sum);
        }
    }
}
