package Chapter9_Exception;

public class ArrayIndexOutOfBoundsException extends Throwable {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int index = 5;
        if(index < 0 || index >= a.length){
            System.out.println("해당 인덱스는 접근할 수 없습니다.");
        }
        else{
            System.out.println(a[index]);
        }
    }
}
