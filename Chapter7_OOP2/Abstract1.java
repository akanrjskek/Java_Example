package Chapter7_OOP2;

abstract class V {
    abstract void method(); // 추상 메서드
    V(){
        System.out.println("This class is V");
    }
}

class W extends V{
    void method(){
        System.out.println("This class is W");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        W w = new W();
        w.method();
    }
}
