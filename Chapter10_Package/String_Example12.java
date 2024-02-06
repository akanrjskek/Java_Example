package Chapter10_Package;

public class String_Example12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        sb.delete(2,5);
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
    }
}
