package Chapter7_OOP2;

class N extends ParentClass{

}


public class Overriding4 {
    public static void main(String[] args) {
        N n = new N();
        n.a = 10;
        n.b = 20;
        n.c = 30;
        System.out.println("n.a = " + n.a + " n.b = " + n.b + " n.c = " + n.c);
    }
}
