package Chapter10_Package;

class A{}

public class Equals_Example1 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.equals(a2));
    }
}
