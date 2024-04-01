package Chapter10_Package;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class BigDecimal_Example2 {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("100.0");
        BigInteger bi = bd.toBigInteger();
        System.out.println(bi);
        System.out.println(bd.multiply(new BigDecimal("100.0")));
        System.out.println(Arrays.toString(bd.divideAndRemainder(new BigDecimal("15.0"))));
        try{
            System.out.println(bd.divide(new BigDecimal("15.0")));
        }
        catch(ArithmeticException e){
            System.out.println("나누어 떨어지지 않습니다.");
        }
    }
}
