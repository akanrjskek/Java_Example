package Chapter10_Package.Calendar;

import java.util.Date;

public class Date2_Example {
    public static void main(String[] args) {
        Date d1 = new Date(1650000000000L);
        Date d2 = new Date(1400000000000L);
        Date d3 = new Date(10000000000L);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1.after(d3));
        System.out.println(d1.before(d3));
        System.out.println(d1.compareTo(d2));
        System.out.println(d2.compareTo(d1));
        System.out.println(d1.equals(new Date(1650000000000L)));
    }
}
