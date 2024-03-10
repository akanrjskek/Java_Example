package Chapter10_Package;

public class Wrapper_Example1 {
    public static void main(String[] args) {
        Byte b = new Byte("1");
        Short s = new Short("2");
        Character c = new Character('2');
        Integer i = new Integer("4");
        Long l = new Long("8");
        Float f = new Float("4");
        Integer d = new Integer("8.0");
        Boolean B = new Boolean(true);
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
