package Chapter10_Package.Calendar;

import java.time.LocalDate;
import java.util.Calendar;

public class Local_Example3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        LocalDate ld = LocalDate.of(2024,1,1);
        c.set(2024,1,1);
        System.out.println(ld);
        System.out.println(c.getTime());
    }
}
