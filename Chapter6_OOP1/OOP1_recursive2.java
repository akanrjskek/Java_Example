package Chapter6_OOP1;

public class OOP1_recursive2 {
    public static int factorial(int num){
        int value;
        if(num == 1) return 1;
        value = num * factorial(num - 1);
        return value;
    }

    public static void main(String[] args) {
        int answer = factorial(5);
        System.out.println(answer);
    }
}
