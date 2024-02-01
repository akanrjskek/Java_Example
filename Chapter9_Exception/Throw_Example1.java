package Chapter9_Exception;

import java.lang.NullPointerException;

public class Throw_Example1 {
    public static void main(String[] args) {
        try{
            String s = null;
            if(s == null){
                throw new NullPointerException();
            }
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("프로그램 종료");
        }
    }
}
