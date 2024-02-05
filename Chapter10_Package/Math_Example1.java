package Chapter10_Package;
import static java.lang.Math.*;

public class Math_Example1 {
    public static void main(String[] args) {
        try{
            int x = Integer.MAX_VALUE; // 2147483647
            int y = 1;
            System.out.println(addExact(x,y));
        }
        catch(ArithmeticException e){
            System.out.println("오버플로우 발생!");
        }
    }
}
