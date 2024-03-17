package Chapter15_Lambda;

import java.util.Optional;

public class Stream_Example9 {
    public static void main(String[] args) {
        Optional<String> s1 = Optional.ofNullable(null);
        Optional<String> s2 = Optional.ofNullable("hello");
        System.out.println(s1.orElse("null"));
        System.out.println(s2.orElse("null"));
    }
}
