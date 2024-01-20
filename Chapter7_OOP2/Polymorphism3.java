package Chapter7_OOP2;

class T{
    int a;

    void parent(){
        System.out.println("parent");
    }
}

class U extends T{
    int b;

    void child(){
        System.out.println("child");
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {
        T t = new U();
        U u = (U) t;
        u.child();
    }
}
