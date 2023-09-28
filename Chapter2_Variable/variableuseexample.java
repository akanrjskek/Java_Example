package Chapter2_Variable;

public class variableuseexample {
    public static void main(String[] args) {
        int hour = 19;
        int minute = 13;
        System.out.println(hour + "시 " + minute + "분");

        int totalMinute = (hour*60) + minute;
        System.out.println("분으로 환산하였을 때 " + totalMinute + "분입니다.");
    }
}
