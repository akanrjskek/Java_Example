package Chapter10_Package.Calendar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Example {
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedString = LocalDateTime.now().format(formatter);
        System.out.println(formattedString);

        formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        formattedString = LocalDateTime.now().format(formatter);
        System.out.println(formattedString);

        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
        formattedString = LocalDateTime.now().format(formatter);
        System.out.println(formattedString);

        formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        formattedString = LocalDateTime.now().format(formatter);
        System.out.println(formattedString);
    }
}
