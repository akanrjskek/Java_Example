package Chapter10_Package;
import static java.lang.Math.*;

public class Random_Example2 {
    public static void main(String[] args) {
        int dice = (int)(random() * 6 + 1);
        System.out.println("주사위 눈: " + dice);
    }
}
