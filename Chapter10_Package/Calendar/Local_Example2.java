package Chapter10_Package.Calendar;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Example2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024,01,01);
        LocalTime lt = LocalTime.of(20,30,30);
        System.out.println(ld);
        System.out.println(lt);
    }
}
