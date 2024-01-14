package Chapter4_Practice;

public class Practice6 {
    public static void main(String[] args) {
        int a = 203;
        if (a % 7 == 0) {
            if (a % 14 == 0) {
                System.out.printf("%d는14의 배수입니다.\n", a);
            }

            else {
                System.out.printf("%d는7의 배수이지만14의 배수는 아닙니다.\n", a);
            }
        }

        else {
            System.out.printf("%d는7의 배수가 아닙니다.\n", a);
        }
    }
}
