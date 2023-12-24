package Chapter3_Practice;

public class Practice3 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(num += 2);
        System.out.println(num -= 2);
        System.out.println(num *= 2);
        System.out.println(num /= 2);
        System.out.println(num %= 2);
        num = 100;
        System.out.println(num >>= 2);
        System.out.println(num <<= 2);
        System.out.println(num &= 2);
        System.out.println(num |= 2);
    }
}
