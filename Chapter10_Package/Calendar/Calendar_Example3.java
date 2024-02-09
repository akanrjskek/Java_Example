package Chapter10_Package.Calendar;

import java.util.Calendar;

public class Calendar_Example3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2024,0,1);
        System.out.println(c.getActualMaximum(Calendar.DATE));
        c.roll(Calendar.MONTH, 1);
        System.out.println(c.getActualMaximum(Calendar.DATE));
    }
}
