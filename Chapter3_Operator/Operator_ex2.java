package Chapter3_Operator;

public class Operator_ex2 {
    public static void main(String[] args) {
        int c = 0b1110;
        int d = 0b1001;
        int candb = c & d;
        int corb = c | d;
        int crightshift = c >> 2;
        int cleftshift = c << 2;
        int notc = ~c;
        System.out.println(candb);
        System.out.println(corb);
        System.out.println(crightshift);
        System.out.println(cleftshift);
        System.out.println(notc);
    }
}
