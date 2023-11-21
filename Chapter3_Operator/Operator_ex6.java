package Chapter3_Operator;

public class Operator_ex6 {
    public static void main(String[] args) {
        int x = 5;
        int y;
        y = x++;
        System.out.println("y = " + y + ", x = " + x);
        y = ++x;
        System.out.println("y = " + y + ", x = " + x);
    }
}
