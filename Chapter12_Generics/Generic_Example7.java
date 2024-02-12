package Chapter12_Generics;

class WildCard<T>{
    WildCard(){}

    public void print(WildCard<? extends Object> gc){
        System.out.println("메서드 호출 성공");
    }
}

class AA{}

public class Generic_Example7 {
    public static void main(String[] args){
        WildCard<AA> a = new WildCard<>();
        a.print(a);
    }
}