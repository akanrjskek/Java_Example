package Chapter4_Control_Statement;

public class Control_ex22 {
    public static void main(String[] args) {
        out: for(int i = 0; i < 10; ++i){
            for(int j = 0; j < 10; ++j){
                if(i == 1){
                    break out;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
