package Chapter10_Package;

import java.math.BigInteger;
import java.util.Arrays;

public class BigInteger_Example2 {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("100");
        System.out.println(b1.divide(new BigInteger("10")));
        System.out.println(b1.multiply(new BigInteger("10")));
        System.out.println(Arrays.toString(b1.divideAndRemainder(new BigInteger("9"))));
        System.out.println(b1.gcd(new BigInteger("15")));
        System.out.println(b1.isProbablePrime(0));
        System.out.println(b1.nextProbablePrime());
    }
}
