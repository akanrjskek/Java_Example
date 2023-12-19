package Chapter6_OOP1;

public class OOP1_method3 {
    public static void method(int v){
        System.out.println("v = " + v);
        v = 20;
    }

    public static void main(String[] args) {
        int a = 10;
        method(a);
        System.out.println("a = " + a);
    }
}
