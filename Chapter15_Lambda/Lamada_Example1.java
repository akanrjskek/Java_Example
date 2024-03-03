package Chapter15_Lambda;

public class Lamada_Example1 {
    public static void main(String[] args) {
         Lambda_Interface1 lc = (a,b) -> a + b;
         System.out.println(lc.returnAplusB(10,20));
    }
}
@FunctionalInterface
interface Lambda_Interface1{
    public abstract int returnAplusB(int a, int b);
}
