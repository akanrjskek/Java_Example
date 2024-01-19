package Chapter7_OOP2;

class L{
    L(){
        System.out.println("parent");
    }
}

class M extends L {
    M(){}

    M(int a){
        this();
        System.out.println("child");
    }
}

public class Overriding3 {
    public static void main(String[] args) {
        M m = new M(0);
    }
}
