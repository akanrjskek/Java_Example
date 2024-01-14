package Chapter7_OOP2;

class E{
    int n;

    void prt(){
        System.out.println("n = " + n);
    }
}

class F extends E{
    int m;

    void prt1(){
        System.out.println("m = " + m);
    }
}

class G extends F{
    int l;

    void prt2(){
        System.out.println("l = " + l);
    }

}

public class Inheritance3 {
    public static void main(String[] args) {
        G g = new G();
        g.n = 10;
        g.m = 20;
        g.l = 30;
        g.prt();
        g.prt1();
        g.prt2();
    }
}
