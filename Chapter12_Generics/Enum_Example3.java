package Chapter12_Generics;

public class Enum_Example3 {
    enum Season{
        SPRING, SUMMER, AUTUMN, WINTER;
    }

    public static void main(String[] args) {
        Season s = Season.SPRING;
        if(s.compareTo(Season.SUMMER) > 1){
            System.out.println("SPRING > SUMMER");
        }
        else if(s.compareTo(Season.SUMMER) == 0){
            System.out.println("SPRING == SUMMER");
        }
        else{
            System.out.println("SPRING < SUMMER");
        }
    }
}