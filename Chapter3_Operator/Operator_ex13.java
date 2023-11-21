package Chapter3_Operator;

public class Operator_ex13 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = new String("abcd");
        String s4 = "ABCD";
        System.out.println(s1 == s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1 == s3);
        System.out.println(System.identityHashCode(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals("abcd"));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}


