package Chapter12_Generics;

import java.util.Arrays;

public class Enum_Example4 {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        System.out.println(Day.MONDAY.name());
        System.out.println("TUESDAY's number: " + Day.TUESDAY.ordinal());
        System.out.println(Day.valueOf("WEDNESDAY"));
        System.out.println(Arrays.toString(Day.values()));
    }
}
