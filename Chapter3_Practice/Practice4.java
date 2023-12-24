package Chapter3_Practice;

public class Practice4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double d = 2.5;
        float f = 12.5f;
        char c = 'A';

        System.out.println("++a = " + ++a);
        System.out.println("a++ = " + a++);
        System.out.println("--b = " + --b);
        System.out.println("b-- = " + b--);
        System.out.println("-d = " + -d);
        System.out.println(d < f);
        System.out.println(a < c);
        System.out.println((b < a) && (d < f));
        System.out.println((f - a) < (d + b));
    }
}
