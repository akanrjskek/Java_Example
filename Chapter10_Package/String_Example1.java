package Chapter10_Package;

public class String_Example1 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
        s1 += " world";
        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
    }
}
