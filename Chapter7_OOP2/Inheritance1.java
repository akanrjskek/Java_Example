package Chapter7_OOP2;

class A{
    int a;
}

class B extends A{
    int b;
}

public class Inheritance1{
    public static void main(String[] args) {
        B b = new B();
        b.a = 10;
        b.b = 20;
        System.out.println("b.a = " + b.a + ", b.b = " + b.b);
    }
}
