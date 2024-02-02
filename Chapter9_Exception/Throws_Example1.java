package Chapter9_Exception;

import java.lang.NullPointerException;
import java.util.Arrays;

public class Throws_Example1 {

    static void nullPointer() throws NullPointerException {
        String s = null;
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        try{
            nullPointer();
        }
        catch(NullPointerException e){
            System.out.println("s는 문자열을 참조하지 않습니다.");
        }

    }
}

