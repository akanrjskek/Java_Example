package Chapter4_Control_Statement;

public class Control_ex23 {
    public static void main(String[] args) {
        for(int i = 0; i < 20; ++i){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
