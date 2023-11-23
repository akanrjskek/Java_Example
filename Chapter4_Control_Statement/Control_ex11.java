package Chapter4_Control_Statement;

public class Control_ex11 {
    public static void main(String[] args) {
        int a = 102;
        if(a % 2 == 0){
            if(a % 4 == 0){
                System.out.printf("%d는4의 배수입니다.\n",a);
            }
            else{
                System.out.printf("%d는2의 배수이지만4의 배수는 아닙니다.\n",a);
            }
        }
        else{
            System.out.printf("%d는 홀수입니다.\n",a);
        }
    }
}
