package Chapter7_OOP2;

class C{
    int a;

    public void prt(){
        System.out.println("a = " + a);
    }
}

class D extends C{}

public class Inheritance2 {
    public static void main(String[] args) {
        D d = new D();
        d.a = 10;
        d.prt();
    }
}
