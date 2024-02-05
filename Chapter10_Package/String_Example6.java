package Chapter10_Package;

public class String_Example6 {
    public static void main(String[] args) {
        String s = "aabbccddeeffgg";
        s = s.replaceAll("[abcdefg]", "z");
        System.out.println(s);
    }
}
