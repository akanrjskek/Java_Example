package Chapter9_Exception;

import java.lang.ArrayIndexOutOfBoundsException;

public class Try_Catch_Finally_Example1 {
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("try-catch문 실행");
        }
    }
}
