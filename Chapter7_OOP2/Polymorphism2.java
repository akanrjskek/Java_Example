package Chapter7_OOP2;

class R{
    int a;

    void parent(){
        System.out.println("parent");
    }
}

class S extends R{
    int b;

    void child(){
        System.out.println("child");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        R r1 = new S(); // Up-casting
        R r2 = new R();
        S s = (S) r2; // Down-casting
        r1.parent();
    }
}
