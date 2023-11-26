package Chapter4_Control_Statement;

public class Control_ex12 {
    public static void main(String[] args) {
        int a = 1;
        switch(a){
            case 1:
                System.out.println("a의 값은 1입니다.");
                int b = a;
                switch(b){
                    case 1:
                        System.out.println("b의 값은 2입니다.");
                        break;
                }
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
        }
    }
}
