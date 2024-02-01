package Chapter9_Exception;

import java.lang.ArrayIndexOutOfBoundsException;

class NewException extends RuntimeException{
    public void printStackTrace(){
        System.out.println("new method");
    }
}

public class Try_Catch_Example4 {
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException | NewException e){
            if(e instanceof NewException){
                System.out.println("NewException");
                e.printStackTrace();
            }
            else{
                System.out.println("ArrayIndexOutOfBoundsException");
                e.printStackTrace();
            }
        }
    }
}
