package Chapter10_Package.Calendar;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Instanct_Example {
    public static void main(String[] args) {
        Instant I1 = Instant.now();
        Instant I2 = Instant.ofEpochSecond(1700000000L);
        System.out.println(I1);
        System.out.println(I2);
        System.out.println(I1.until(I2, ChronoUnit.DAYS));
    }
}
