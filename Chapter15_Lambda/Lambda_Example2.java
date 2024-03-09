package Chapter15_Lambda;

public class Lambda_Example2 {

    static Lambda_Interface2 method1(){
        Lambda_Interface2 lc2 = (a) -> System.out.println(a * 3);
        return lc2;
    }

    static void method2(Lambda_Interface2 lc){
        lc.print(10);
    }


    public static void main(String[] args) {
        Lambda_Interface2 lc1 = (a) -> System.out.println(a*2);
        Lambda_Interface2 lc2 = method1();
        lc1.print(10);
        lc2.print(10);
        method2((a) -> System.out.println(a * 4));
    }
}

interface Lambda_Interface2{
    public abstract void print(int a);
}
