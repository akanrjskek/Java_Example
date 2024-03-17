package Chapter15_Lambda;

import java.util.Optional;

public class Stream_Example10 {
    public static void main(String[] args) {
        Optional<String> str = Optional.ofNullable("hello world");
        System.out.println(str.orElse("empty string"));

        int len1 = Optional.ofNullable("hello world").
                map(String::length).orElse(-1);
        int len2 = Optional.ofNullable("517").
                map(Integer::parseInt).orElse(0);
        System.out.println("len1 = " + len1 + ", len2 = " + len2);

        Optional<Double> db = Optional.ofNullable(3.14);

        if(db.isPresent()){
            System.out.println(db.orElse(0.0));
        }

        db.ifPresent(System.out::println);
    }
}
