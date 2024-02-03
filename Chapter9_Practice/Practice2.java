package Chapter9_Practice;

class A{}
class B extends A{
    void printB(){
        System.out.println("This is B class");
    }
}
class C extends A{
    void printC(){
        System.out.println("This is C class");
    }
}

public class Practice2 {

    static void cCastMethod(A instance){
        try{
            C c = (C)instance;
            c.printC();
        }
        catch(ClassCastException e){
            System.out.println("This is not C instance");
        }

    }

    public static void main(String[] args) {
        A a = new B();
        cCastMethod(a);
    }
}
