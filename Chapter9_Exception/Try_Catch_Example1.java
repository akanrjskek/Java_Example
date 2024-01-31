package Chapter9_Exception;

public class Try_Catch_Example1 {
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[5]);
        }
        catch(Exception e){
            if(e instanceof java.lang.ArrayIndexOutOfBoundsException){
                System.out.println("예외 클래스로 보는 다형성");
            }
            System.out.println("해당 인덱스는 접근할 수 없습니다.");
        }
    }
}
