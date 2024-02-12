package Chapter12_Generics;

class A<T>{
    T member;

    A(T member){
        this.member = member;
    }

    public String toString(){
        return "이 객체의 타입 변수로 사용된 타입은 " + member.getClass().getName() + "입니다.";
    }
}

public class Generics_Example2 {
    public static void main(String[] args) {
        A<Integer> aInteger = new A<>(10);
        A<String> aString = new A<>("hello");
        System.out.println(aInteger);
        System.out.println(aString);
    }
}
