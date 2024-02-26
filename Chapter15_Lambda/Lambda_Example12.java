package Chapter15_Lambda;

import java.util.Optional;
import java.util.OptionalInt;

public class Lambda_Example12 {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.ofNullable("hello");
        Optional<Integer> optionalI = optionalS.map(String::length);
        System.out.println(optionalS.orElse(""));
        System.out.println(optionalI.orElse(0));

    }
}
