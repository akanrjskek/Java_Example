package Chapter12_Generics;

class GC<T>{
    public <T> void method(T a){
        System.out.println(a.getClass());
    }
}

public class Generics_Example9 {
    public static void main(String[] args) {
        GC<String> gc = new GC<>();
        gc.method("string");
        gc.<Integer>method(10);
    }
}
