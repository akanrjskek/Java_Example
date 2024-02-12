package Chapter12_Generics;

class GenericClass<T>{
    GenericClass(){}
    T member;

    void method(String s){
        System.out.println("parent " + s);
    }
}

class GenericChildClass<T> extends GenericClass{
    GenericChildClass(){}

    void method(String s){
        System.out.println("child " + s);
    }
}

public class Generics_Example3 {
    public static void main(String[] args) {
        GenericClass<String> g = new GenericChildClass<String>();
        g.method("hello");
    }
}
