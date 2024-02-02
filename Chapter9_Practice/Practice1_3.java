package Chapter9_Practice;

import java.lang.ArrayIndexOutOfBoundsException;

public class Practice1_3 {
    public static void main(String[] args) {
        try{
            int[] a = {5,4,3,2,1};
            System.out.println(a[-1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 값이 올바르지 않습니다.");
        }

    }
}
