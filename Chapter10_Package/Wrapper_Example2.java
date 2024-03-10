package Chapter10_Package;

public class Wrapper_Example2 {
    public static void main(String[] args) {
        byte b = new Byte("1");
        short  s = new Short("2");
        char c = new Character('2');
        int i = new Integer("4");
        long l = new Long("8");
        float f = new Float("4");
        Integer d = new Integer("8.0");
        boolean B = new Boolean(true);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("B = " + B);
    }
}
