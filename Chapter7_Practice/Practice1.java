package Chapter7_Practice;

class A {
    int a;
    int b;

    void parent(){
        System.out.println("parent");
    }
}

class B extends A{
    int c;
    int d;

    void child(){
        System.out.println("child");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        B b = new B();
    }
}
