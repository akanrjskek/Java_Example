package Chapter4_Control_Statement;
public class Control_ex8 {
    public static void main(String[] args) {
        int a = 100;
        switch(a){
            case 100:
                System.out.println("a = " + a + "입니다.");
                break;
            case 90:
                System.out.println("해당 사항 없습니다.");
                break;
            default:
                System.out.println("default");
        }
    }
}
