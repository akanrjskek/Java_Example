package Chapter10_Package;

class D{
    int a;
    int b;
    String s;

    D(int a, int b, String s){
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public void method(){
        System.out.println("this is method");
    }
}

public class GetClass_Example {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException{
        D d = new D(1,2,"hello");
        System.out.println(d.getClass());
        System.out.println(d.getClass().getDeclaredField("a"));
        System.out.println(d.getClass().getMethod("method"));
    }
}
