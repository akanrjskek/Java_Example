package Chapter10_Package;

import java.math.BigInteger;

public class BigInteger_Example1 {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = BigInteger.valueOf(100);
        System.out.println(bi1);
        System.out.println(bi2);
    }
}
