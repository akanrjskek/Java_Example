package Chapter7_OOP2;

class P{
    int a;
    int b;
    int c;
    void parent(){
        System.out.println("parent");
    }
}

class Q extends P{
    int d;
    int e;

    void child(){
        System.out.println("child");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        P p = new Q();
        p.a = 10;
        p.b = 20;
        p.c = 30;
        p.parent();
    }
}
