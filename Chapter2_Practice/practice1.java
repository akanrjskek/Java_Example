package Chapter2_Practice;

public class practice1 {
    public static void main(String[] args) {
        int a = 10;
        {
            System.out.println(a);
            int b;
            {
                b = 20;
                System.out.println(b);
                int c = 30;
            }
            //System.out.println(c);
        }
    }
}
