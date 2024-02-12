package Chapter12_Generics;

public class Enum_Example2 {
    enum Season{
        SPRING, SUMMER, AUTUMN, WINTER;
    }

    public static void main(String[] args) {
        Season s = Season.SPRING;
        if(s == Season.SPRING){
            System.out.println("현재 계절은 봄입니다.");
        }
    }
}
