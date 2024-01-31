package Chapter9_Exception;

import java.util.Arrays;

public class NullPointerException {
    public static void main(String[] args) {
        String s = null;
        if(s != null){
            char[] c = s.toCharArray();
            System.out.println(Arrays.toString(c));
        }
        else{
            System.out.println("s가 참조하는 값이 없습니다.");
        }
    }
}
