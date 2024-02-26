package Chapter8_Interface;

abstract class A {
    abstract void method(); // 추상 메서드
    A(){
        System.out.println("This class is V");
    }
}

class B extends A{
    void method(){
        System.out.println("This class is W");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        B w = new B();
        w.method();
    }
}