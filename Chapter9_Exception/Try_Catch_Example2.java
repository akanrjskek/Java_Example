package Chapter9_Exception;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.util.Arrays;


public class Try_Catch_Example2 {
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[5]);
            a = null;
            System.out.println(a[0]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
