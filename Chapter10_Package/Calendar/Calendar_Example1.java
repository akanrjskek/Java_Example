package Chapter10_Package.Calendar;

import java.util.Calendar;

public class Calendar_Example1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(toString(c));
    }

    public static String toString(Calendar c){
        return "현재 날짜 및 시간은 " + c.get(Calendar.YEAR) + "년 " + c.get(Calendar.MONDAY) +
                "월 " + c.get(Calendar.DATE) + "일 " + c.get(Calendar.HOUR_OF_DAY) + "시 " + c.get(Calendar.MINUTE) +
                "분 " + c.get(Calendar.SECOND) + "초 입니다.";
    }
}
