package Chapter4_Control;

public class Control_ex9 {
    public static void main(String[] args) {
        int a = 100;
        switch(a){
            case 100:
                System.out.println("a = " + a + "입니다.");
            case 90:
                System.out.println("해당 사항 없습니다.");
            default:
                System.out.println("default");
        }
    }
}
