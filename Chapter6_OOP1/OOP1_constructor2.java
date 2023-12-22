package Chapter6_OOP1;

class D{
    int a;
    int b;
    int c;

    D(int aa, int bb, int cc){
        a = aa;
        b = bb;
        c = cc;
    }

    void method(int aa, int bb, int cc){
        a = aa;
        b = bb;
        c = cc;
    }
}

public class OOP1_constructor2 {
    public static void main(String[] args) {
        D d = new D(1,2,3);
        System.out.println("d.a = " + d.a + " d.b = " + d.b + " d.c = " + d.c);
    }
}
