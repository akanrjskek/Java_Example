package Chapter10_Package;

import java.util.Arrays;

public class String_Example7 {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] sarr = s.split("[le]");
        System.out.println(Arrays.toString(sarr));
    }
}
