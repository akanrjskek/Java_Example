package Chapter15_Lambda;

import java.util.Optional;

public class Lambda_Example11 {
    public static void main(String[] args) {
        String s = "";
        Optional<String> opt = Optional.ofNullable("");
        s = opt.orElseGet(() -> new String("new string"));
        System.out.println(s);
    }
}
