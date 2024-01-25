class A {
    void method(int a){
        System.out.println("a = " + a);
    }
}

class B extends A {
    void method(int a, int b){
        System.out.println("a = " + a);
    }
}


public class Main {
    public static void main(String[] args){
        A a = new B();
    }
}