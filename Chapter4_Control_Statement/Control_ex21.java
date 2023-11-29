package Chapter4_Control_Statement;

public class Control_ex21 {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            System.out.println("i = " + i);
            i++;
            if(i >= 5){
                break;
            }
        }
    }
}
