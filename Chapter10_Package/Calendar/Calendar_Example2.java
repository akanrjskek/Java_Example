package Chapter10_Package.Calendar;

import java.util.Calendar;

public class Calendar_Example2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2023,1,9,19,15,30);
        System.out.println(c.getTime());
        c.set(Calendar.YEAR, 2024);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.getTime());
        c.add(Calendar.HOUR, 25);
        System.out.println(c.getTime());
        c.roll(Calendar.HOUR, 25);
        System.out.println(c.getTime());
    }
}
