package Chapter10_Package;

public class String_Example3 {
    public static void main(String[] args) {
        String s = "hello hello";

        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("l",3));
        System.out.println(s.indexOf("hel"));
        System.out.println(s.indexOf("hel",1));
    }
}
