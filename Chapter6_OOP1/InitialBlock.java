package Chapter6_OOP1;

class A{
    static int n = 5;
    static{
        System.out.println("n = " + n);
        n = 10;
    }
    int m = 10;
    {
        System.out.println("m = " + m);
        m = 15;
    }
    A(){
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        n = 20;
        m = 30;
    }
}
public class InitialBlock {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A.n = " + A.n);
        System.out.println("a.m = " + a.m);
    }
}