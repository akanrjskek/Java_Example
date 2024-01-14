package Chapter6_OOP1;

class E{
    int a;
    int b;
    int c;

    E(){
        this(10,20,30);
    }

    E(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class OOP1_Constructor {
    public static void main(String[] args) {
        E e = new E();
        System.out.println("e.a = " + e.a + " e.b = " + e.b + " e.c = " + e.c);
    }
}
