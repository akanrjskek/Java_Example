package Chapter9_Practice;

public class Practice1_2 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.compareTo("hello"));
        }
        catch(NullPointerException e){
            System.out.println("비교할 수 있는 값이 없습니다.");
        }
    }
}