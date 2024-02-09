package Chapter10_Package.Calendar;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Example1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        System.out.println(ld);
        System.out.println(lt);
    }
}
