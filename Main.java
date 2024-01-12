class A{
    static int a = 5;
    static{
        System.out.println("a = " + a);
        a = 10;
    }
    int b = 10;
    {
        System.out.println("b = " + b);
        b = 15;
    }
    A(){
        a = 20;
        b = 30;
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A.a = " + A.a);
        System.out.println("a.b = " + a.b);
    }
}