package Chapter9_Exception;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ClassCastException;

public class Try_Catch_Example3 {
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException | ClassCastException e){
            e.printStackTrace();
            System.out.println("에러 발생");
        }
    }
}
