package Chapter12_Generics;

public class Enum_Example1 {
    static final int SPRING = 0;
    static final int SUMMER = 1;
    static final int AUTUMN = 2;
    static final int WINTER = 3;

    static final int EAST = 0;
    static final int WEST = 1;
    static final int SOUTH = 2;
    static final int NORTH = 3;

    public static void main(String[] args) {
        int a = 0;
        if(a == EAST){
            System.out.println("현재는 봄입니다.");
        }
    }
}
