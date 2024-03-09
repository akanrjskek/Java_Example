package Chapter15_Lambda;
import java.util.function.*;

public class Lambda_Example3 {
    static <T> String randomString(Supplier<T> c){
        StringBuilder sb = new StringBuilder();
        int a = (int)(Math.random() * 10) + 1;
        for(int i = 0; i < a; ++i){
            sb.append(c.get());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Supplier<Character> s = () -> (char)(Math.random() * 26 + 65);
        System.out.println(randomString(s));
    }
}
