package Chapter10_Package.Calendar;

import java.time.Instant;
import java.util.Date;

public class Date1_Example {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(1200000000000L);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
}
