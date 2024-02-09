package Chapter4_Control_Statement;

public class Control_ex17 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int sum = 0;
        for(int number : arr){
            sum += number;
            System.out.printf("더해지는 수: %d\t sum = %d\n",number,sum);
        }

    }
}
