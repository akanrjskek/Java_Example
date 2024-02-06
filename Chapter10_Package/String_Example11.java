package Chapter10_Package;

public class String_Example11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(System.identityHashCode(sb));
        sb.append("Hello ");
        System.out.println(System.identityHashCode(sb));
        sb.append("World");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb);
    }
}
