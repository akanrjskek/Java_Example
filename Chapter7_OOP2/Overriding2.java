package Chapter7_OOP2;

class J{
    void prt(){
        System.out.println("parent");
    }
}

class K extends J {
    @Override
    void prt(){
        System.out.println("child");
    }
}

public class Overriding2 {
    public static void main(String[] args) {
        K k = new K();
        k.prt();
    }
}