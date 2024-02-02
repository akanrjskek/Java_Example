package Chapter9_Exception;

import java.util.Arrays;
import java.lang.NullPointerException;

public class Throws_Example2 {

    static void nullPointer() throws NullPointerException {
        String s = null;
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
    }

    static void callMethod() throws NullPointerException {
        nullPointer();
    }

    public static void main(String[] args) {
        try{
            callMethod();
        }
        catch(NullPointerException e){
            System.out.println("s는 문자열을 참조하지 않습니다.");
        }
    }
}
