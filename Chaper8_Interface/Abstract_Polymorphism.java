package Chaper8_Interface;

abstract class AbClass {
    abstract void abmethod();
}

class ChildClass extends AbClass {
    void abmethod(){
        System.out.println("Polymorphism");
    }
}

public class Abstract_Polymorphism {
    public static void main(String[] args) {
        AbClass ab = new ChildClass();
        ab.abmethod();
    }
}
