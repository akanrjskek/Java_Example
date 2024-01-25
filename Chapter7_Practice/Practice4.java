package Chapter7_Practice;

class H {
    void method(){
        System.out.println("parent");
    }
}

class I extends H {
    void method(){
        System.out.println("child");
    }
}

public class Practice4 {
    public static void main(String[] args) {
        H h = new I();
        h.method();
    }
}
