package Chapter9_Exception;

public class Try_Catch_Finally_Example2 {
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[5]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("예외 발생");
            return;
        }
        finally {
            System.out.println("try-catch문 실행");
        }
    }
}
