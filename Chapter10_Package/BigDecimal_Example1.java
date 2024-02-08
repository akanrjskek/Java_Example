package Chapter10_Package;

import java.math.BigDecimal;

public class BigDecimal_Example1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("950.517");
        BigDecimal bd2 = BigDecimal.valueOf(950.517);
        System.out.println(bd1);
        System.out.println(bd2);
    }
}
