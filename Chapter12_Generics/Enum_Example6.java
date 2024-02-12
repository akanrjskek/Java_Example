package Chapter12_Generics;

public class Enum_Example6 {
    enum Season{
        SPRING("봄",3,5),
        SUMMER("여름",6,8),
        AUTUMN("가을",9,11),
        WINTER("겨울",12,2);

        private final String name;
        private final int start;
        private final int end;

        Season(String name, int start, int end){
            this.name = name;
            this.start = start;
            this.end = end;
        }

        public String Name(){
            return name;
        }

        public int Start(){
            return start;
        }

        public int End(){
            return end;
        }

    }
    public static void main(String[] args) {
        Season spr = Season.SPRING;
        Season sum = Season.SUMMER;
        Season aut = Season.AUTUMN;
        Season win = Season.WINTER;

        Season[] seasons = Season.values();

        for(int i = 0; i < seasons.length; ++i){
            System.out.println(seasons[i].Name() + "의 시작 월은 " + seasons[i].Start() + "월이고 끝나는 월은 "
             + seasons[i].End() + "월이다.");
        }
    }
}
