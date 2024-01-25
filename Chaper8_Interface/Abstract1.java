package Chaper8_Interface;

abstract class Tea {
    abstract void teaName();
}

class GreenTea extends Tea{
    void teaName(){
        System.out.println("GreenTea");
    }
}

class Coffee extends Tea {
    void teaName(){
        System.out.println("Coffee");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        GreenTea gt = new GreenTea();
        Coffee cf = new Coffee();
        gt.teaName();
        cf.teaName();
    }
}