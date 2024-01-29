package Chaper8_Interface;

interface Inter1{
    abstract void method1();
}

interface Inter2{
    abstract void method2();
}

class MultiInheritance implements Inter1, Inter2{
    public void method1(){
        System.out.println("method1");
    }

    public void method2(){
        System.out.println("method2");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        MultiInheritance inter = new MultiInheritance();
        inter.method1();
        inter.method2();
    }
}
