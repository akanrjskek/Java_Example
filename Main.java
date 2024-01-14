class A{
    int n;

    A(){
        this(0);
    }

    A(int n){
        this.n = n;
    }


}

class B extends A{}

public class Main {
    public static void main(String[] args) {
        //B a = new A();
    }
}