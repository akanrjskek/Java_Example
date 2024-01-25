package Chapter7_Practice;

class C {
    int c;

    void C(){
        System.out.println("C class");
    }
}

class D extends C {
    int d;

    void D(){
        System.out.println("D class");
    }
}

class E extends D {
    int e;

    void E(){
        System.out.println("E class");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        E e = new E();
    }
}
