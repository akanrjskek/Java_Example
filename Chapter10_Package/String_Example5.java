package Chapter10_Package;

public class String_Example5 {
    public static void main(String[] args) {
        String s = "aabbccddeeffgg";
        s = s.replaceAll("a","z");
        System.out.println(s);
    }
}
