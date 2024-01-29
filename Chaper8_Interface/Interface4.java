package Chaper8_Interface;

interface Parent {
    public abstract void parent();
}

interface Brother1 extends Parent{
    public abstract void brother1();
}

interface Brother2 extends Parent{
    public abstract void brother2();
}

class ParentClass implements Parent {
    public void parent(){
        System.out.println("This is ParentClass");
    }
}

class Brother1Class implements Brother1 {
    public void parent(){
        System.out.println("This is ParentClass");
    }

    public void brother1(){
        System.out.println("This is Brother1Class");
    }
}

class Brother2Class implements Brother2 {
    public void parent(){
        System.out.println("This is ParentClass");
    }

    public void brother2(){
        System.out.println("This is Brother2Class");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Parent p1 = new ParentClass();
        Parent p2 = new Brother1Class();
        Parent p3 = new Brother2Class();
        Brother1 b1 = new Brother1Class();
        Brother2 b2 = new Brother2Class();
        p1.parent();
        p2.parent();
        p3.parent();
        b1.parent();
        b1.brother1();
        b2.brother2();
        b2.brother2();
    }
}
