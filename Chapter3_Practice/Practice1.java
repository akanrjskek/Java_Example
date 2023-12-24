package Chapter3_Practice;

public class Practice1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ + ++x - y++ + --y - ++x;
        System.out.println(z);
    }
}
