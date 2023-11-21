package Chapter4_Control;

public class Control_ex10 {
    public static void main(String[] args) {
        int a = 102;
        if(a % 2 == 0){
            if(a % 4 == 0){
                System.out.printf("%d는 4의 배수입니다.\n",a);
            }
            else{
                System.out.printf("%d는 2의 배수이지만 4의 배수는 아닙니다.\n",a);
            }
        }
        else{
            System.out.printf("%d는 홀수입니다.\n",a);
        }
    }
}
