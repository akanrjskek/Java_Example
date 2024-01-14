package Chapter6_Practice;

public class Practice4 {
    static int sum = 0;
    public static void recursive(int n){
        sum += n;
        if(n == 50){
            return;
        }
        recursive(n + 1);
    }

    public static void main(String[] args) {
        recursive(1);
        System.out.println("sum = " + sum);
    }
}
