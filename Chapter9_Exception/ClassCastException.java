package Chapter9_Exception;

interface A{}

class B implements A{
    public String toString(){
        return "This is B instance";
    }
}

class C implements A{
    public String toString(){
        return "This is C instance";
    }
}

public class ClassCastException {

    static C returnC(A a){
        C c;
        if(a instanceof C){
            c = (C)a;
        }
        else{
            return null;
        }
        return c;
    }


    public static void main(String[] args) {
        A a = new B();
        C c = returnC(a);
        if(c == null){
            System.out.println("This is not C instance");
        }
        else{
            System.out.println(c);
        }
    }
}
