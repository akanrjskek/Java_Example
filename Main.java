public class Main {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello2";
        s1 = "hello2";
        System.out.println(s1 == s2);
    }
}