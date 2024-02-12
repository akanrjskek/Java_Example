class GenericClass<T>{
    GenericClass(){}

    public void print(GenericClass<? extends Object> gc){
        System.out.println("메서드 호출 성공");
    }
}

class A{}

public class Main {
    public static void main(String[] args){
        GenericClass<A> a = new GenericClass<>();
        a.print(a);
    }
}